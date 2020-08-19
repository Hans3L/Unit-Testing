package com.creativity.example.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumTest {

    Logger LOG = LogManager.getLogger(SumTest.class);

    private Sum sum;

    @BeforeEach
    void setUp() {
        this.sum = new Sum();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSummation() {
        Assert.assertEquals(this.sum.summation(new int[] {15,47,100,3}),165);
    }

    @Test
    public void testEmptySummation(){
        try {
            this.sum.summation(new int[] {});
            LOG.info("Lista vacia del test");
        } catch (RuntimeException e){
            Assert.assertTrue(true);
        }
    }
}