package udemy.springframework.spring_udemy_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Cat")
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cats are the best";
    }
}