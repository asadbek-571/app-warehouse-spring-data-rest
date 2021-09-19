package uz.pdp.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AttachmentDto {

    Long id;

    String name;


    public String getName() {
        if (name == null || "".equals(name))
            return "";

        return "C:\\Users\\Asus\\OneDrive\\Рабочий стол\\spring\\lesson10\\app-credit-shop\\files\\" + name;
    }
}
