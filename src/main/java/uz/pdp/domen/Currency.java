package uz.pdp.domen;

import lombok.Getter;
import lombok.Setter;
import uz.pdp.domen.abs.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "currency")
public class Currency extends AbsEntity {
}
