package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        /* valid */
        when(appleService.processApple(anyInt(), anyString())).thenReturn("i eat apple");
        /* valid */
        when(appleService.processApple(anyInt(), eq("Macintosh"))).thenReturn("i eat apple");
        /* in valid */
        when(appleService.processApple(ArgumentMatchers.anyInt(), "Macintosh")).thenReturn("i eat apple");
    }
}