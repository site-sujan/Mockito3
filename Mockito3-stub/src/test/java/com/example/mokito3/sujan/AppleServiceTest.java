package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class); 
        when(appleService.processApple("Macintosh")).thenReturn("apple name is Macintosh");
        String appleName = appleService.processApple("Macintosh");
        assertEquals("apple name is Macintosh", appleName);
    }

    @Test
    void saveAppleWithAnnotationMockTest() { 
        when(appleService.processApple("Macintosh")).thenReturn("apple name is Macintosh");
        String appleName = appleService.processApple("Macintosh");
        assertEquals("apple name is Macintosh", appleName);
    }
}
