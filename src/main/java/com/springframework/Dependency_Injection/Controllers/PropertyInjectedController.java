package com.springframework.Dependency_Injection.Controllers;

import com.springframework.Dependency_Injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
        public GreetingService greetingService;

        public String getGreeting(){
            return greetingService.sayGreeting();
        }

    }
