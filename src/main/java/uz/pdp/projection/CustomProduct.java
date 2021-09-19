package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Category;
import uz.pdp.domen.Measurement;
import uz.pdp.domen.Product;
import uz.pdp.domen.Warehouse;

@Projection(types = Product.class)
public interface CustomProduct {

    Long getId();

    String getName();

    Category getCategory();

    Boolean getActive();

    Measurement getMeasurement();

    Integer getCode();
}
