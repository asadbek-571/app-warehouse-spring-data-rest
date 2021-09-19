package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.Product;
import uz.pdp.projection.CustomProduct;


@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepo extends JpaRepository<Product,Long> {


}
