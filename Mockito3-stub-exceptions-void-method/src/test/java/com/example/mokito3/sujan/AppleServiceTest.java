package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        doThrow(new RuntimeException()).when(appleService).processApple(anyString());
        assertThrows(RuntimeException.class, () -> appleService.processApple("Macintosh"));
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        doThrow(new RuntimeException()).when(appleService).processApple(anyString());
        assertThrows(RuntimeException.class, () -> appleService.processApple("Macintosh"));
    }
}