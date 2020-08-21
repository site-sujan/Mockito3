package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Captor
    ArgumentCaptor<String> argumentCaptor;
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleMethodMockTest() {
        /* never use argumentCaptor while stubbing */
        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        /* stub never invoked
        appleService.saveApple("Macintosh");*/
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(appleService).saveApple(argumentCaptor.capture());
        System.out.println("argumentCaptor = " + argumentCaptor.getValue());
        assertEquals("Macintosh", argumentCaptor.getValue());
    }

    @Test
    void saveAppleAnnotationMockTest() {
        /* never use argumentCaptor while stubbing */
        when(appleService.saveApple(argumentCaptor.capture())).thenReturn("i eat apple");
        /* stub never invoked
        appleService.saveApple("Macintosh");*/
        verify(appleService).saveApple(argumentCaptor.capture());
        System.out.println("argumentCaptor = " + argumentCaptor.getValue());
        assertEquals("Macintosh", argumentCaptor.getValue());
    }
}