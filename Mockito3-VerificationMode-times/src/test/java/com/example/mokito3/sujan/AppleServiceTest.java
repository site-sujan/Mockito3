package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenCallRealMethod();
        appleService.processApple("Macintosh");
        verify(appleService, times(1)).saveApple("Macintosh");
        verify(appleService, times(0)).saveNullApple("Macintosh");
    }

    @Test
    void saveAppleWithNullMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple(null)).thenCallRealMethod();
        appleService.processApple(null);
        verify(appleService, times(1)).saveNullApple(null);
        verify(appleService, times(0)).saveApple(null);
    }
}