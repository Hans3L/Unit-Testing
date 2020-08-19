package com.creativity.example.injection;

import org.apache.logging.log4j.LogManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SingletonMessageServiceWithoutInjectionTest {

    private SingletonMessageService singletonMessageService;

    @Before
    public void before(){
        //SingletonMessageService singletonMessageService = new SingletonMessageService();
        this.singletonMessageService = new SingletonMessageService();
    }


    @Test
    public void testGetMessage(){
        Assert.assertTrue(this.singletonMessageService.getMessage().length() > 0);
        LogManager.getLogger(this.getClass()).info("=======>>> NOTE, without injection");
        LogManager.getLogger(this.getClass()).info("==========>> message: " + this.singletonMessageService.getMessage());
    }
}
