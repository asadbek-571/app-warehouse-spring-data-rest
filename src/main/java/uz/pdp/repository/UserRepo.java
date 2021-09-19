package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.Users;
import uz.pdp.projection.CustomUser;


@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepo extends JpaRepository<Users,Long> {


}
