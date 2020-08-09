package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenReturn("apple object is null");
        when(appleService.processApple(null)).thenReturn("apple name is Macintosh");
        String appleName = appleService.processApple("Macintosh");
        assertEquals("apple object is null", appleName);
        appleName = appleService.processApple(null);
        assertEquals("apple name is Macintosh", appleName);
    }
}