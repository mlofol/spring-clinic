package springframework.springclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.springclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {

}
