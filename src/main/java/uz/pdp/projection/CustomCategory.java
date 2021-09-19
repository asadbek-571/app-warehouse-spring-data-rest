package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Category;
import uz.pdp.domen.Warehouse;

@Projection(types = Category.class)
public interface CustomCategory {

    Long getId();

    String getName();

    Category getParent();

    Boolean getActive();
}
