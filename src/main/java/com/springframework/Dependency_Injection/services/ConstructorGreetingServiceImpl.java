package com.springframework.Dependency_Injection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World-Constructor";
    }

}