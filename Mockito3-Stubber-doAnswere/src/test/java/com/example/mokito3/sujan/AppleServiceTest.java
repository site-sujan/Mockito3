package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        doAnswer(invocation -> {
            Object[] args = invocation.getArguments();
            System.out.println("args = " + Arrays.toString(args));
            Object mock = invocation.getMock();
            System.out.println("mock = " + mock);
            return null;
        }).when(appleService).processApple("Macintosh");
        appleService.processApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        doAnswer(invocation -> {
            Object[] args = invocation.getArguments();
            System.out.println("args = " + Arrays.toString(args));
            Object mock = invocation.getMock();
            System.out.println("mock = " + mock);
            return null;
        }).when(appleService).processApple("Macintosh");
        appleService.processApple("Macintosh");
    }
}