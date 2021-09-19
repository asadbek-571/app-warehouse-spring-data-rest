package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.Input;
import uz.pdp.projection.CustomInput;


@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepo extends JpaRepository<Input, Long> {


}
