package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;
    @Mock
    private AppleRepo appleRepo;

    @Test
    void saveAppleFinalClassMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        String apple = appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        assertEquals("i eat apple", apple);
    }

    @Test
    void saveAppleFinalMethodMockTest() {
        when(appleRepo.saveApple("Macintosh")).thenReturn("i eat apple");
        String apple = appleRepo.saveApple("Macintosh");
        verify(appleRepo).saveApple("Macintosh");
        assertEquals("i eat apple", apple);
    }
}