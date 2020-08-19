package com.creativity.example.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideTest {

    private Divide divide;

    @Before
    public void before(){
        this.divide = new Divide();
    }

    @Test
    public void testQuotient(){
        Assert.assertEquals(divide.quotient(20,5),4);
        Assert.assertEquals(divide.quotient(20,0),0);
    }
}
