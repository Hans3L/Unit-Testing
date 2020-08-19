package com.creativity.example.injection;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionMain {

    @Autowired
    private SingletonMessageService singletonMessageService;

    public String getMessage(){
        return this.singletonMessageService.getMessage();
    }

    public void debug(){
        LogManager.getLogger(this.getClass()).info(">>> " + this.singletonMessageService.getMessage());
    }
}
