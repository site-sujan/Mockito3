package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithoutMockTest() {
        AppleService appleService = new AppleService();
        appleService.saveApple("Macintosh");
    }

    @Test
    void saveAppleWithMockTest() {
        appleService.saveApple("Macintosh");
    }
}