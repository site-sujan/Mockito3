package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleMockTest() {
        when(appleService.saveApple("Macintosh", "Fuji", "Gala")).thenReturn("i eat apple");
        appleService.saveApple("Macintosh", "Fuji", "Gala");
        ArgumentCaptor<String[]> argumentCaptor = ArgumentCaptor.forClass(String[].class);
        verify(appleService).saveApple(argumentCaptor.capture());
        System.out.println("argumentCaptor = " + argumentCaptor.getAllValues());
        assertEquals(Arrays.asList("Macintosh", "Fuji", "Gala"), argumentCaptor.getAllValues());
    }
}