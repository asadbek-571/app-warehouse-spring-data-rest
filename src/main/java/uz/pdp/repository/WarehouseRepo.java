package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.Warehouse;
import uz.pdp.projection.CustomWarehouse;


@RepositoryRestResource(path = "warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepo extends JpaRepository<Warehouse,Long> {

}
