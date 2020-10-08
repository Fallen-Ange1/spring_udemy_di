package udemy.springframework.spring_udemy_di.controller;

import org.springframework.stereotype.Controller;
import udemy.springframework.spring_udemy_di.services.PetService;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichAreTheBest(){
        return petService.getPetType();
    }
}
