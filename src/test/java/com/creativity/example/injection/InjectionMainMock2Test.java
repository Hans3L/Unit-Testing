package com.creativity.example.injection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InjectionMainMock2Test {

    private static final String MESSAGE = "Yes Response";

    @Mock
    private SingletonMessageService singletonMessageServiceMockito;

    @InjectMocks
    private InjectionMain injectionMain;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(singletonMessageServiceMockito.getMessage()).thenReturn(MESSAGE);
    }

    @Test
    public void testGetMessage(){
        //dado                                           probablemente retorne
        given(this.singletonMessageServiceMockito.getMessage()).willReturn("ok");
        Assert.assertEquals("ok",this.injectionMain.getMessage());
    }
}
