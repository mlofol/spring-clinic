package springframework.springclinic.services;

import springframework.springclinic.model.Pet;

import java.util.Set;

public interface VerService {

    Pet findById(Long id);
    Pet save (Pet pet);
    Set<Pet> findAll();
}
