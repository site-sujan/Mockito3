package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.AdditionalAnswers.answersWithDelay;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {

    @Test
    void saveAppleMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.saveApple("Macintosh")).thenAnswer(answersWithDelay(1000, InvocationOnMock::getMock));
        System.out.println("apple = " + appleService.saveApple("Macintosh"));
    }
}