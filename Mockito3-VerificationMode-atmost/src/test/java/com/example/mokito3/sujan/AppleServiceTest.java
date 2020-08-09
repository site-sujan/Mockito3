package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenCallRealMethod();
        appleService.processApple("Macintosh");
        verify(appleService, atMostOnce()).saveApple("Macintosh");
        verify(appleService, atMost(1)).saveApple("Macintosh");
    }

    @Test
    void saveAppleWithNullMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple(null)).thenCallRealMethod();
        appleService.processApple(null);
        verify(appleService, atMostOnce()).saveNullApple(null);
        verify(appleService, atMost(1)).saveNullApple(null);
    }
}