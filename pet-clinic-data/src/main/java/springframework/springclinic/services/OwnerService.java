package springframework.springclinic.services;

import springframework.springclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String name);

}
