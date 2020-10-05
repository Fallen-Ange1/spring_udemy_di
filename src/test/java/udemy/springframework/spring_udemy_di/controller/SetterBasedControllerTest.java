package udemy.springframework.spring_udemy_di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import udemy.springframework.spring_udemy_di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {
    SetterBasedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}