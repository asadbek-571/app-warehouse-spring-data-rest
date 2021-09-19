package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.InputProduct;
import uz.pdp.projection.CustomInputProduct;


@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepo extends JpaRepository<InputProduct, Long> {


}
