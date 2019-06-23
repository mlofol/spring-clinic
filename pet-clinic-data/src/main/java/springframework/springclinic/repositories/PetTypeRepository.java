package springframework.springclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.springclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
