package com.creativity.example.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractTest {

    private Subtract subtract;

    @Before
    public void before(){
        this.subtract = new Subtract();
    }

    @Test
    public void testMinus(){
        Assert.assertEquals(subtract.minus(20,5),15);
    }
}
