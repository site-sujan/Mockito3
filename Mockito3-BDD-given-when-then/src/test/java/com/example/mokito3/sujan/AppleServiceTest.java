package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(serializable = true)
    private AppleService appleService;

    @Test
    void saveAppleWithoutMockTest() {
        // given
        given(appleService.saveApple("Macintosh")).willReturn("i eat apple");
        // when
        String macApple = appleService.saveApple("Macintosh");
        // then
        assertEquals("i eat apple", macApple);
    }
}