package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple(ArgumentMatchers.anyString())).thenReturn("i eat apple");
        when(appleService.processApple(ArgumentMatchers.endsWith("sh"))).thenReturn("i eat macintosh apple");
        when(appleService.processApple(ArgumentMatchers.contains("ji"))).thenReturn("i eat fuji apple");
        when(appleService.processApple(ArgumentMatchers.startsWith("ga"))).thenReturn("i eat gala apple");
        assertEquals("i eat apple", appleService.processApple(new String()));
        assertEquals("i eat macintosh apple", appleService.processApple("macintosh"));
        assertEquals("i eat fuji apple", appleService.processApple("fuji"));
        assertEquals("i eat gala apple", appleService.processApple("gala"));
    }
}