package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public abstract class Persona {
    @Setter
    @Getter
    protected String nombre;
    protected String apellido;




}
