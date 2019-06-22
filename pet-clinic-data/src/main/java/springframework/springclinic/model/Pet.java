package springframework.springclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="pets")
public class Pet extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    @Column(name="birth_date")
    private LocalDate brithDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(LocalDate brithDate) {
        this.brithDate = brithDate;
    }
}
