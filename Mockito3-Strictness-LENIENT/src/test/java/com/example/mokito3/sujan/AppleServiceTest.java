package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;
    @Mock
    private Exception exception;

    @Test
    void saveAppleFinalClassMockTest() {
        /* Unnecessary stub */
//        when(appleService.saveApple("Macintosh")).thenReturn("i eat apple");
        when(appleService.saveApple("Fuji")).thenReturn("i eat apple");
        String apple = appleService.saveApple("Fuji");
        verify(appleService).saveApple("Fuji");
        assertEquals("i eat apple", apple);
    }
}
