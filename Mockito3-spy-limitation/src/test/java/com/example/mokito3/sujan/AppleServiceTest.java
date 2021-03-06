package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Spy
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        when(appleService.getApple(0)).thenReturn("Macintosh");
        String appleName = appleService.getApple(0);
        Assertions.assertEquals("Macintosh", appleName);
    }
}