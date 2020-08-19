package com.creativity.example.injection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreInjectionMainTest {

    private InjectionMain injectionMain;

    @Before
    public void before(){
        this.injectionMain = new InjectionMain();
    }

    @Ignore("El método main va ser ignorado por no contar con logica")
    @Test
    public void testMain(){
        Assert.assertFalse(true);
    }
}
