package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        verify(appleService, times(1)).saveApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        verify(appleService, times(1)).saveApple("Macintosh");
    }
}