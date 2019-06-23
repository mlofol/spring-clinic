package springframework.springclinic.services;

import springframework.springclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String name);

}
