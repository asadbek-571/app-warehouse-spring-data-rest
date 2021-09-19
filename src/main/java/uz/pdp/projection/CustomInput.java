package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Currency;
import uz.pdp.domen.Input;
import uz.pdp.domen.Supplier;
import uz.pdp.domen.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Long getId();

    Timestamp getReceiveDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();
}
