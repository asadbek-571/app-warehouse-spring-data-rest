package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Client;
import uz.pdp.domen.Currency;
import uz.pdp.domen.Output;
import uz.pdp.domen.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Long getId();

    Timestamp getSoldDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();
}
