package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        doNothing().when(appleService).processApple("Macintosh");
        appleService.processApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        doNothing().when(appleService).processApple("Macintosh");
        appleService.processApple("Macintosh");
    }
}