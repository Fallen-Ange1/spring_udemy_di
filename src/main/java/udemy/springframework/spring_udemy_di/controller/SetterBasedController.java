package udemy.springframework.spring_udemy_di.controller;

import udemy.springframework.spring_udemy_di.services.GreetingService;

public class SetterBasedController {
     private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
