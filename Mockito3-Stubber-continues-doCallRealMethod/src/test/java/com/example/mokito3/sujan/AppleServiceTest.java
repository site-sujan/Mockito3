package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        doCallRealMethod().when(appleService).processApple("Macintosh");
        String apple = appleService.processApple("Macintosh");
        Assertions.assertEquals("I love Macintosh Apple", apple);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        doCallRealMethod().when(appleService).processApple("Macintosh");
        String apple = appleService.processApple("Macintosh");
        Assertions.assertEquals("I love Macintosh Apple", apple);
    }
}