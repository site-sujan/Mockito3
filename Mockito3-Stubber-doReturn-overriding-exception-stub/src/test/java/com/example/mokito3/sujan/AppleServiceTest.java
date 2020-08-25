package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenThrow(new RuntimeException("exception will be thrown"));
        when(appleService.processApple("Macintosh")).thenReturn("i eat apple");
        String apple = appleService.processApple("Macintosh");
        Assertions.assertEquals("i eat apple", apple);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.processApple("Macintosh")).thenThrow(new RuntimeException("exception will be thrown"));
        when(appleService.processApple("Macintosh")).thenReturn("i eat apple");
        String apple = appleService.processApple("Macintosh");
        Assertions.assertEquals("i eat apple", apple);
    }
}