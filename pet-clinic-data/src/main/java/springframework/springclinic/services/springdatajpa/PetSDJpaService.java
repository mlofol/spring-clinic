package springframework.springclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.springclinic.model.Pet;
import springframework.springclinic.repositories.PetRepository;
import springframework.springclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile(("springdatajpa"))
public class PetSDJpaService implements PetService {


    private final PetRepository petRepository;


    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }



    @Override
    public Set<Pet> findAll() {

        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().iterator().forEachRemaining(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);

    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);

    }
}
