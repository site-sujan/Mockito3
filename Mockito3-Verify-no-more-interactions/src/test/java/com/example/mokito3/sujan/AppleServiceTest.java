package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        verify(appleService).getApple("Macintosh");
        Mockito.verifyNoMoreInteractions(appleService);
    }
}