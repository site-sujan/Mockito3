package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.willThrow;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithoutMockTest() {
        //given
        willThrow(new IllegalArgumentException()).given(appleService).saveApple(null);
        // when // then
        assertThrows(IllegalArgumentException.class, () -> appleService.saveApple(null));
    }
}