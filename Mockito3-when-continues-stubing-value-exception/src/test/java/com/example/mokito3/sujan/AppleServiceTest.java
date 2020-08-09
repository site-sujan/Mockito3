package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        when(appleService.processApple("Macintosh")).thenReturn("i eat macintosh apple").thenThrow(new RuntimeException()).thenReturn("i eat fuji apple");
        assertEquals("i eat macintosh apple", appleService.processApple("Macintosh"));
        assertThrows(RuntimeException.class, () -> appleService.processApple("Macintosh"));
        assertEquals("i eat fuji apple", appleService.processApple("Macintosh"));
    }
}