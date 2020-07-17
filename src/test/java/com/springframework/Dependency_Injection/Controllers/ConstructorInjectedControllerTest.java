package com.springframework.Dependency_Injection.Controllers;

import com.springframework.Dependency_Injection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class ConstructorInjectedControllerTest {

        ConstructorInjectedController controller;

        @BeforeEach
        void setUp() {
            controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
        }

        @Test
        void getGreeting() {

            assertEquals("Hello World",controller.getGreeting());

        }
}
