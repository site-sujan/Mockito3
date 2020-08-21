package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleServiceMock;
    @Spy
    private AppleService appleServiceSpy;

    @Test
    void saveMockMockingDetailsTest() {
        when(appleServiceMock.saveApple("Macintosh")).thenReturn("i have apple");
        appleServiceMock.saveApple("Macintosh");
        verify(appleServiceMock).saveApple("Macintosh");
        MockingDetails mockingDetail = mockingDetails(appleServiceMock);
        System.out.println("is Mock = " + mockingDetails(appleServiceMock).isMock());
        System.out.println("is Spy = " + mockingDetails(appleServiceMock).isSpy());
        System.out.println("Mock Type= " + mockingDetail.getMockCreationSettings().getTypeToMock());
        System.out.println("Constructor Args = " + Arrays.toString(mockingDetail.getMockCreationSettings().getConstructorArgs()));
        System.out.println("Default Answer = " + mockingDetail.getMockCreationSettings().getDefaultAnswer());
        System.out.println("Extra Interface = " + mockingDetail.getMockCreationSettings().getExtraInterfaces());
        System.out.println("Invocation Listeners = " + mockingDetail.getMockCreationSettings().getInvocationListeners());
        System.out.println("Mock name = " + mockingDetail.getMockCreationSettings().getMockName());
        System.out.println("Outer class instance = " + mockingDetail.getMockCreationSettings().getOuterClassInstance());
        System.out.println("Serializable mode = " + mockingDetail.getMockCreationSettings().getSerializableMode());
        System.out.println("Spied instance = " + mockingDetail.getMockCreationSettings().getSpiedInstance());
        System.out.println("Verification Started listener = " + mockingDetail.getMockCreationSettings().getVerificationStartedListeners());
        System.out.println("is Using constructor = " + mockingDetail.getMockCreationSettings().isUsingConstructor());
        System.out.println("is Stub Only = " + mockingDetail.getMockCreationSettings().isStubOnly());
        System.out.println("is Strip Annotation = " + mockingDetail.getMockCreationSettings().isStripAnnotations());
        System.out.println("is Serializable = " + mockingDetail.getMockCreationSettings().isSerializable());
        System.out.println("is Lenient = " + mockingDetail.getMockCreationSettings().isLenient());
        System.out.println("get Mock = " + mockingDetail.getMock());
        System.out.println("Invocations = " + mockingDetail.getInvocations());
        System.out.println("Stubbing = " + mockingDetail.getStubbings());
        System.out.println("Invocations = " + mockingDetails(appleServiceMock).printInvocations());
    }

    @Test
    void saveSpyMockingDetailsTest() {
        when(appleServiceSpy.saveApple("Macintosh")).thenReturn("i have apple");
        appleServiceSpy.saveApple("Macintosh");
        verify(appleServiceSpy).saveApple("Macintosh");
        MockingDetails mockingDetail = mockingDetails(appleServiceSpy);
        System.out.println("is Mock = " + mockingDetails(appleServiceSpy).isMock());
        System.out.println("is Spy = " + mockingDetails(appleServiceSpy).isSpy());
        System.out.println("Mock Type= " + mockingDetail.getMockCreationSettings().getTypeToMock());
        System.out.println("Constructor Args = " + Arrays.toString(mockingDetail.getMockCreationSettings().getConstructorArgs()));
        System.out.println("Default Answer = " + mockingDetail.getMockCreationSettings().getDefaultAnswer());
        System.out.println("Extra Interface = " + mockingDetail.getMockCreationSettings().getExtraInterfaces());
        System.out.println("Invocation Listeners = " + mockingDetail.getMockCreationSettings().getInvocationListeners());
        System.out.println("Mock name = " + mockingDetail.getMockCreationSettings().getMockName());
        System.out.println("Outer class instance = " + mockingDetail.getMockCreationSettings().getOuterClassInstance());
        System.out.println("Serializable mode = " + mockingDetail.getMockCreationSettings().getSerializableMode());
        System.out.println("Spied instance = " + mockingDetail.getMockCreationSettings().getSpiedInstance());
        System.out.println("Verification Started listener = " + mockingDetail.getMockCreationSettings().getVerificationStartedListeners());
        System.out.println("is Using constructor = " + mockingDetail.getMockCreationSettings().isUsingConstructor());
        System.out.println("is Stub Only = " + mockingDetail.getMockCreationSettings().isStubOnly());
        System.out.println("is Strip Annotation = " + mockingDetail.getMockCreationSettings().isStripAnnotations());
        System.out.println("is Serializable = " + mockingDetail.getMockCreationSettings().isSerializable());
        System.out.println("is Lenient = " + mockingDetail.getMockCreationSettings().isLenient());
        System.out.println("get Mock = " + mockingDetail.getMock());
        System.out.println("Invocations = " + mockingDetail.getInvocations());
        System.out.println("Stubbing = " + mockingDetail.getStubbings());
        System.out.println("Invocations = " + mockingDetails(appleServiceSpy).printInvocations());
    }
}