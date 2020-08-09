package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Spy
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        appleService.processApple("Macintosh");
        verify(appleService).processApple("Macintosh");
    }
}