package udemy.springframework.spring_udemy_di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import udemy.springframework.spring_udemy_di.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService service;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService service) {
        this.service = service;
    }
    public String getGreeting() {
        return service.sayGreeting();
    }
}
