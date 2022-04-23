package com.astralTinderV1.enttities;

import javax.persistence.Entity;
import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class AstralPlane {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private ZodiacSigns ascendente;

    private ZodiacSigns lunarSign;

    private ZodiacSigns solarSign;

    private Cualidades cualidad;

    private Elements element;

}
