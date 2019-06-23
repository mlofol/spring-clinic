package springframework.springclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.springclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
