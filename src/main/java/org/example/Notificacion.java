package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Notificacion {
    @Getter
    @Setter
    private String titulo;
    private String descripcion;
    private Incidente incidente;
    private Boolean enviado;


}
