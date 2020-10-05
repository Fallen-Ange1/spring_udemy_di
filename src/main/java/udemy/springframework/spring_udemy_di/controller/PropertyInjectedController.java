package udemy.springframework.spring_udemy_di.controller;

import udemy.springframework.spring_udemy_di.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
