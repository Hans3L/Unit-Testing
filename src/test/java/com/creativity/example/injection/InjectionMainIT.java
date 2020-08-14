package com.creativity.example.injection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class InjectionMainIT {

    @Autowired
    private InjectionMain injectionMain;

    @Test
    public void testGetMessage(){
        Assert.assertEquals(true,this.injectionMain.getMessage().length() > 0);
    }
}
