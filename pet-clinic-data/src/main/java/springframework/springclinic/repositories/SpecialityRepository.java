package springframework.springclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.springclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
