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
        when(appleService.processApple("Fuji")).thenThrow(IllegalArgumentException.class).thenThrow(ArrayIndexOutOfBoundsException.class);
        assertThrows(IllegalArgumentException.class, () -> appleService.processApple("Macintosh"));
        assertThrows(IllegalArgumentException.class, () -> appleService.processApple("Fuji"));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> appleService.processApple("Fuji"));
    }
}