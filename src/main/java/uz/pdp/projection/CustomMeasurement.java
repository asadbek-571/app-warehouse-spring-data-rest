package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Measurement;
import uz.pdp.domen.Warehouse;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Long getId();

    String getName();

    boolean getActive();
}
