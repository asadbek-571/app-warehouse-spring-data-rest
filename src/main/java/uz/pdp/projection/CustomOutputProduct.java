package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Output;
import uz.pdp.domen.OutputProduct;
import uz.pdp.domen.Product;
import uz.pdp.domen.Warehouse;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
