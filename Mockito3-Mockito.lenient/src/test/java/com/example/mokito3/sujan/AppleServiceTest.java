package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        lenient().when(appleService.saveApple("Fuji")).thenReturn("i eat Fuji apple");
        when(appleService.saveApple("Macintosh")).thenReturn("i eat Macintosh apple");
        String apple = appleService.saveApple("Macintosh");
        Assertions.assertEquals("i eat Macintosh apple", apple);
        verify(appleService).saveApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        lenient().when(appleService.saveApple("Fuji")).thenReturn("i eat Fuji apple");
        when(appleService.saveApple("Macintosh")).thenReturn("i eat Macintosh apple");
        String apple = appleService.saveApple("Macintosh");
        Assertions.assertEquals("i eat Macintosh apple", apple);
        verify(appleService).saveApple("Macintosh");
    }
}