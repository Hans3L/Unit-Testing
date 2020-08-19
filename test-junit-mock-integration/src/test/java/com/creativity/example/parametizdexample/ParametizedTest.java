package com.creativity.example.parametizdexample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.is;


@RunWith(value = Parameterized.class)
public class ParametizedTest {

    //private MathUtils mathUtils;
    private int nume1;
    private int nume2;
    private int expected;

    public ParametizedTest(int nume1, int nume2, int expected) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.expected = expected;
    }

   /* @Before
    public void before(){
        this.mathUtils = new MathUtils();
    }*/

    @Parameterized.Parameters
    public static Collection<Object []> data(){
        return Arrays.asList(new Object[][]{
                {2,3,5},
                {50,50,100},
                {9,1,10},
                {7,8,15}
        });
    }

    @Test
    public void testAdd(){
        //Assert.assertThat(MathUtils.add(nume1 , nume2),is(expected));
        //Assert.assertEquals(this.mathUtils.add(nume1 , nume2),(expected));
       Assert.assertEquals(MathUtils.add(nume1 , nume2),(expected));
    }
}
