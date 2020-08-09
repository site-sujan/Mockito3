package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple("Macintosh")).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class, () -> appleService.processApple("Macintosh"));
    }
}