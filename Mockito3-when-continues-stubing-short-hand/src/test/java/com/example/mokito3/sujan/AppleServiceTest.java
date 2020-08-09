package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenReturn("i eat macintosh apple", "i eat fuji apple", "i eat gala apple");
        assertEquals("i eat macintosh apple", appleService.processApple("Macintosh"));
        assertEquals("i eat fuji apple", appleService.processApple("Macintosh"));
        assertEquals("i eat gala apple", appleService.processApple("Macintosh"));
    }
}