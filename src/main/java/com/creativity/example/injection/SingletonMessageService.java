package com.creativity.example.injection;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class SingletonMessageService {

    @Value("${creativity-name}")
    private String name;

    @PostConstruct
    public void constructor(){
        LogManager.getLogger(this.getClass()).warn(">>> create Bean: SingletonMessageService");
        LogManager.getLogger(this.getClass()).warn(">>> creativity-name : " + this.name);
    }

    public String getMessage(){
        return "(" + this.hashCode() + ") SingleMessageService!!!, creativity-name " + this.name;
    }

    @PreDestroy
    public void destroy(){
        LogManager.getLogger(this.getClass()).info(">>> SingletonMessageService: destroy()");
    }
}
