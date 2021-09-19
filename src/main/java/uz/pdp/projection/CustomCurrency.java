package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Currency;
import uz.pdp.domen.Warehouse;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Long getId();

    String getName();

    boolean getActive();
}
