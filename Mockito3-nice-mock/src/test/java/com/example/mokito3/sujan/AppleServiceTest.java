package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleServiceAnnotation;

    @Test
    void saveAppleMockTest() {
        AppleService appleServiceStaticMock = mock(AppleService.class);
        String macintoshStaticMock = appleServiceStaticMock.saveApple("Macintosh");
        String macintoshAnnotation = appleServiceAnnotation.saveApple("Macintosh");
        System.out.println("macintoshStaticMock = " + macintoshStaticMock + " macintoshAnnotation = " + macintoshAnnotation);
    }
}