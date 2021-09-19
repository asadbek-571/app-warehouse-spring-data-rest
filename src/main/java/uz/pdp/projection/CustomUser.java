package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domen.Users;
import uz.pdp.domen.Warehouse;

import javax.persistence.*;
import java.util.Set;

@Projection(types = Users.class)
public interface CustomUser {

    Long getId();

    String getFirstName();

    String getLastName();

    boolean getActive();

    String getPhoneNumber();

    Long getCode();

    String getPassword();

    Set<Warehouse> getWarehouses();
}
