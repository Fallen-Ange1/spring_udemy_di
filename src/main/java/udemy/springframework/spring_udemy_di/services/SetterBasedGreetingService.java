package udemy.springframework.spring_udemy_di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World ---setter";
    }
}
