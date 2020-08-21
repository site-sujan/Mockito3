package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(name = "appleMock")
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, "appleMock");
        System.out.println("mock name is " + Mockito.mockingDetails(appleService).getMockCreationSettings().getMockName());
        String apple = appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        assertEquals("i love Macintosh apple", apple);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        System.out.println("mock name is " + Mockito.mockingDetails(appleService).getMockCreationSettings().getMockName());
        String apple = appleService.saveApple("Macintosh");
        verify(appleService).saveApple("Macintosh");
        assertEquals("i love Macintosh apple", apple);
    }
}