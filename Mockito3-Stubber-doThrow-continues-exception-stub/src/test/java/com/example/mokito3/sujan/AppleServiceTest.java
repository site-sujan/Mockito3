package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        doThrow(new RuntimeException(), new NullPointerException()).when(appleService).processApple("Macintosh");
        assertThrows(RuntimeException.class, () -> appleService.processApple("Macintosh"));
        assertThrows(NullPointerException.class, () -> appleService.processApple("Macintosh"));
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        doThrow(new RuntimeException(), new NullPointerException()).when(appleService).processApple("Macintosh");
        assertThrows(RuntimeException.class, () -> appleService.processApple("Macintosh"));
        assertThrows(NullPointerException.class, () -> appleService.processApple("Macintosh"));
    }
}