package springframework.springclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.springclinic.model.Speciality;
import springframework.springclinic.repositories.SpecialityRepository;
import springframework.springclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile(("springdatajpa"))
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;


    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;     
    }



    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> specialitys = new HashSet<>();
        specialityRepository.findAll().iterator().forEachRemaining(specialitys::add);
        return specialitys;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);

    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);

    }
}
