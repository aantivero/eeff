package com.aantivero.eeff;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Entidad {
    @Id @GeneratedValue
    private Long id;
    private String codigo;
    private String denominacion;
    private Integer codigoNumerico;
}
