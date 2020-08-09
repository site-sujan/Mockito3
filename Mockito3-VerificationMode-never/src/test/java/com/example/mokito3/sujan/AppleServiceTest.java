package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void processAppleMockTest() {
        when(appleService.processApple("Macintosh")).thenReturn("i have apple");
        String apple = appleService.processApple("Macintosh");
        verify(appleService, times(1)).processApple("Macintosh");
        verify(appleService, times(0)).saveApple("Macintosh");
        verify(appleService, never()).saveApple("Macintosh");
        assertEquals("i have apple", apple);
    }

    @Test
    void saveAppleMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        String apple = appleService.saveApple("Macintosh");
        verify(appleService, times(1)).saveApple("Macintosh");
        verify(appleService, times(0)).processApple("Macintosh");
        verify(appleService, never()).processApple("Macintosh");
        assertEquals("i have apple", apple);
    }
}