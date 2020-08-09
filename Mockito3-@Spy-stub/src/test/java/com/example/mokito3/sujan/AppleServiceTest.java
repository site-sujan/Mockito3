package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Spy
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        when(appleService.processApple("Macintosh")).thenReturn("i eat apple");
        String appleMock = appleService.processApple("Macintosh");
        String apple = appleService.saveApple("Macintosh");
        verify(appleService).processApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        Assertions.assertEquals("i eat apple", appleMock);
        Assertions.assertEquals("i like Macintosh Apple", apple);
    }
}