package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Incidente {
    @Getter
    @Setter
    private String descripcion;
    private Especialidad tipoProblema;

}
