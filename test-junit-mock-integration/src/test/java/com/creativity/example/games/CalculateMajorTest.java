package com.creativity.example.games;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateMajorTest {

    Logger LOG = LogManager.getLogger(CalculateMajorTest.class);

    int lista [] = {1000,979,-20000};

    private Largest largelist;

    @Before
    public void before(){
        this.largelist = new Largest();
    }

    @Test
    public void testLargest(){
        Assert.assertEquals(this.largelist.largest(lista), 1000);
    }

    @Test
    public void testSimple(){
        Assert.assertEquals(this.largelist.largest(new int[] {1000,979,-20000}), 1000);
        Assert.assertEquals(this.largelist.largest(new int[] {-20000,1000,979}), 1000);
        Assert.assertEquals(this.largelist.largest(new int[] {-20000,979,1000}), 1000);
        Assert.assertEquals(this.largelist.largest(new int[] {-20000,1000,979,1000}), 1000);
        Assert.assertEquals(this.largelist.largest(new int[] {1000}), 1000);
        Assert.assertEquals(this.largelist.largest(new int[] {-7,-9,-5}), -5);
        //Assert.assertEquals(this.largelist.largest(new int[] {}), -5);
    }

    @Test
    public void testEmpty() {
        try {
            this.largelist.largest(new int[] {});
            LOG.info("Debería haber lanzado una excepción");
        } catch (RuntimeException e){
            Assert.assertTrue(true);
        }
    }
}
