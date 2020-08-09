package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class AppleServiceTest {
    @Test
    void saveAppleWithoutMockTest() {
        AppleService appleService = new AppleService();
        appleService.saveApple("Macintosh");
    }

    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        appleService.saveApple("Macintosh");
    }
}