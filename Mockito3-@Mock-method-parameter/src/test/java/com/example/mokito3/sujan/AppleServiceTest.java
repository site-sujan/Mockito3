package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("apple name is Macintosh");
        String appleName = appleService.saveApple("Macintosh");
        assertEquals("apple name is Macintosh", appleName);
    }

    @Test
    void saveAppleMockTest(@Mock AppleService appleService) {
        when(appleService.saveApple("Fuji")).thenReturn("apple name is Fuji");
        String appleName = appleService.saveApple("Fuji");
        assertEquals("apple name is Fuji", appleName);
    }
}