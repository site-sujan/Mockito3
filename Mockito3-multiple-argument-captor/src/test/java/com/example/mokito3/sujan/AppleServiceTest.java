package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithoutMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        String macApple = appleService.saveApple("Macintosh");
        assertEquals("i eat apple", macApple);
        verify(appleService).saveApple("Macintosh");
        reset(appleService);
        when(appleService.saveApple("Fuji")).thenReturn("i love apple");
        String fujiApple = appleService.saveApple("Fuji");
        assertEquals("i love apple", fujiApple);
        verify(appleService).saveApple("Fuji");
    }
}