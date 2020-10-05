package udemy.springframework.spring_udemy_di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import udemy.springframework.spring_udemy_di.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller= new PropertyInjectedController();
        controller.greetingService=new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}