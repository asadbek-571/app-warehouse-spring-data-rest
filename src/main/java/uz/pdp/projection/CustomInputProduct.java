package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Input;
import uz.pdp.domen.InputProduct;
import uz.pdp.domen.Product;
import uz.pdp.domen.Warehouse;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
