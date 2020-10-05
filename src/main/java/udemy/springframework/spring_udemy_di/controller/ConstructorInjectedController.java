package udemy.springframework.spring_udemy_di.controller;

import udemy.springframework.spring_udemy_di.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService service;

    public ConstructorInjectedController(GreetingService service) {
        this.service = service;
    }
    public String getGreeting() {
        return service.sayGreeting();
    }
}
