package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
    }
}