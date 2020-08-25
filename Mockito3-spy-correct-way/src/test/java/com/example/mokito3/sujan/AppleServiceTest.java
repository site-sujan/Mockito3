package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Spy
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        doReturn("i eat apple").when(appleService).processApple("Macintosh");
        when(appleService.processApple("Fuji")).thenCallRealMethod();
        doThrow(new RuntimeException()).when(appleService).processApple(null);
        String appleMac = appleService.processApple("Macintosh");
        String appleFuji = appleService.processApple("Fuji");
        assertThrows(RuntimeException.class, () -> appleService.processApple(null));
        verify(appleService).processApple("Macintosh");
        verify(appleService).processApple("Fuji");
        verify(appleService).processApple(null);
        Assertions.assertEquals("i eat apple", appleMac);
        Assertions.assertEquals("i love Fuji Apple", appleFuji);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        doReturn("i eat apple").when(appleService).processApple("Macintosh");
        when(appleService.processApple("Fuji")).thenCallRealMethod();
        doThrow(new RuntimeException()).when(appleService).processApple(null);
        String appleMac = appleService.processApple("Macintosh");
        String appleFuji = appleService.processApple("Fuji");
        assertThrows(RuntimeException.class, () -> appleService.processApple(null));
        verify(appleService).processApple("Macintosh");
        verify(appleService).processApple("Fuji");
        verify(appleService).processApple(null);
        Assertions.assertEquals("i eat apple", appleMac);
        Assertions.assertEquals("i love Fuji Apple", appleFuji);
    }
}