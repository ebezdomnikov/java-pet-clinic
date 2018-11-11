package javaevgenii.javapetclinic.services;

import java.util.Set;
import javaevgenii.javapetclinic.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
