package com.creativity.example.injection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class InjectionMainMessageServiceMockTest {

    @Mock
    private SingletonMessageService singletonMessageServiceMock;

    @InjectMocks
    private InjectionMain injectionMain;

    @Test
    public void testGetMessage(){
        given(this.singletonMessageServiceMock.getMessage()).willReturn("ok");
        Assert.assertEquals("ok",this.injectionMain.getMessage());
    }





}
