package com.creativity.example.exceptionhandling;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ExceptionHandlingTest {

    @Before
    public void before(){}


    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){
        int x = 10/0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFueraDeIndice(){
        new ArrayList<Object>().get(20);
    }
}
