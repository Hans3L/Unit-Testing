package com.creativity.example.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplyTest {

    private Multiply multiply;

    @Before
    public void before(){
        this.multiply = new Multiply();
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(multiply.times(4,5),20);
        Assert.assertEquals(multiply.times(0,5),0);
        Assert.assertEquals(multiply.times(0,0),0);
        Assert.assertEquals(multiply.times(-9,5),-45);
    }
}
