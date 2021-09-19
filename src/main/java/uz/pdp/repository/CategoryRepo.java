package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.Category;
import uz.pdp.projection.CustomCategory;


@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepo extends JpaRepository<Category,Long> {

}
