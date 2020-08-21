package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Answers.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(answer = CALLS_REAL_METHODS)
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, Mockito.CALLS_REAL_METHODS);
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        String apple = appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        assertEquals("i have apple", apple);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        String apple = appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        assertEquals("i have apple", apple);
    }
}