package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        doAnswer(invocation -> "Macintosh").when(appleService).saveApple("Macintosh");
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        verifyZeroInteractions(appleService);
    }
}