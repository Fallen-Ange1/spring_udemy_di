package udemy.springframework.spring_udemy_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Dog","default"})
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs are the best";
    }
}
