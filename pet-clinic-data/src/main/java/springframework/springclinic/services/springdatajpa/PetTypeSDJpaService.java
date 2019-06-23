package springframework.springclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.springclinic.model.PetType;
import springframework.springclinic.repositories.PetTypeRepository;
import springframework.springclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile(("springdatajpa"))
public class PetTypeSDJpaService implements PetTypeService {


    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService( PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;

    }



    @Override
    public Set<PetType> findAll() {

        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().iterator().forEachRemaining(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);

    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);

    }
}
