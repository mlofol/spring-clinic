package springframework.springclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public Long getid(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

}
