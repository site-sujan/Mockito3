package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = when(mock(AppleService.class).processApple("Macintosh")).thenReturn("apple name is Macintosh").getMock();
        String appleName = appleService.processApple("Macintosh");
        verify(appleService).processApple("Macintosh");
        assertEquals("apple name is Macintosh", appleName);
    }
}