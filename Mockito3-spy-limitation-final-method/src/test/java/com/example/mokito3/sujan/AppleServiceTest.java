package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Spy
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        doReturn("Macintosh").when(appleService).getApple(0);
        String appleName = appleService.getApple(0);
        Assertions.assertEquals("Macintosh", appleName);
    }
}