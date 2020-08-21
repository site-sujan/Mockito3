package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Captor
    ArgumentCaptor<String> argumentCaptor;
    @Mock
    private AppleService appleService;

    @Test
    void saveApplePartialMethodMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        when(appleService.getApple("Macintosh")).thenCallRealMethod();
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        verify(appleService).getApple("Macintosh");
    }

    @Test
    void saveApplePartialAnnotationMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        when(appleService.getApple("Macintosh")).thenCallRealMethod();
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        verify(appleService).getApple("Macintosh");
    }
}