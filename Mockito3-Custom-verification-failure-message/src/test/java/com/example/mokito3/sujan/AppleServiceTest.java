package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.description;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        String apple = appleService.saveApple("Macintosh");
        Assertions.assertEquals("i eat apple", apple);
        verify(appleService, description("appleService#saveApple is not called with Fuji parameter")).saveApple("Fuji");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        String apple = appleService.saveApple("Macintosh");
        Assertions.assertEquals("i eat apple", apple);
        verify(appleService, description("appleService#saveApple is not called with Fuji parameter")).saveApple("Fuji");
    }
}