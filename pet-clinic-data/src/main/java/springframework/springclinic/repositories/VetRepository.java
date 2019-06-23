package springframework.springclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.springclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastname);
}
