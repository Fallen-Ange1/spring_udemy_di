package udemy.springframework.spring_udemy_di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import udemy.springframework.spring_udemy_di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}