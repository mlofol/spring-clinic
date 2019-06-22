package springframework.springclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="specialties")
public class Speciality extends BaseEntity{

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

}
