package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.domen.Measurement;
import uz.pdp.projection.CustomMeasurement;


@RepositoryRestResource(path = "measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepo extends JpaRepository<Measurement,Long> {


}
