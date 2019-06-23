package springframework.springclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.springclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
