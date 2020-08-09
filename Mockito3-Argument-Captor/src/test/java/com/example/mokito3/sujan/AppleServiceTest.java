package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        appleService.saveApple("Macintosh");
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(appleService).saveApple(argumentCaptor.capture());
        System.out.println("argumentCaptor = " + argumentCaptor.getValue());
        assertEquals("Macintosh", argumentCaptor.getValue());
    }
}