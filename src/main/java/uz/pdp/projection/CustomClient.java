package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Client;
import uz.pdp.domen.Warehouse;

@Projection(types = Client.class)
public interface CustomClient {

    Long getId();

    String getName();

    String getPhoneNumber();

    Boolean getActive();
}
