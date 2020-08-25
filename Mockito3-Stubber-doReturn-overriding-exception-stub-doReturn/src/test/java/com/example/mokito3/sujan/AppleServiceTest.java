package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenThrow(new RuntimeException("exception will be thrown"));
        doReturn("i eat apple").when(appleService).processApple("Macintosh");
        String apple = appleService.processApple("Macintosh");
        Assertions.assertEquals("i eat apple", apple);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.processApple("Macintosh")).thenThrow(new RuntimeException("exception will be thrown"));
        doReturn("i eat apple").when(appleService).processApple("Macintosh");
        String apple = appleService.processApple("Macintosh");
        Assertions.assertEquals("i eat apple", apple);
    }
}