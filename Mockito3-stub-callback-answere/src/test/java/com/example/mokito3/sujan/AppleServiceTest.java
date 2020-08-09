package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        when(appleService.processApple("Macintosh")).thenAnswer(
                (Answer) invocation -> {
                    Object[] args = invocation.getArguments();
                    Object mock = invocation.getMock();
                    Method method = invocation.getMethod();
                    return "called with arguments: " + Arrays.toString(args) + " for mock: " + mock + " in method: " + method.getName();
                });
        System.out.println(appleService.processApple("Macintosh"));
        verify(appleService).processApple("Macintosh");

    }
}