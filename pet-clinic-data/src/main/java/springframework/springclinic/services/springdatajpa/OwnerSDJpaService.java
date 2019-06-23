package springframework.springclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.springclinic.model.Owner;
import springframework.springclinic.repositories.OwnerRepository;
import springframework.springclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile(("springdatajpa"))
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;


    public OwnerSDJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;

    }

    @Override
    public Owner findByLastName(String name) {

        return ownerRepository.findByLastName(name);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().iterator().forEachRemaining(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);

    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);

    }
}
