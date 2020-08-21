package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {

    @Test
    void saveAppleMockTest() {
        AppleService appleServiceOriginal = mock(AppleService.class);
        when(appleServiceOriginal.saveApple("Macintosh")).thenReturn("i love apple");
        /* all the invocations of appleServiceMock will be deligate to appleServiceOriginal */
        AppleService appleServiceMock = mock(AppleService.class, AdditionalAnswers.delegatesTo(appleServiceOriginal));
        String apple = appleServiceMock.saveApple("Macintosh");
        System.out.println("apple = " + apple);
        assertEquals("i love apple", apple);
        verify(appleServiceOriginal).saveApple("Macintosh");
    }
}