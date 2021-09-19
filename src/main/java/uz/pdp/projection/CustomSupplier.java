package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Supplier;
import uz.pdp.domen.Warehouse;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Long getId();

    String getName();

    String getPhoneNumber();

    Boolean getActive();
}
