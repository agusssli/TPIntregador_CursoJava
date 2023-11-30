package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;


public class Tecnico extends Persona {
    public ArrayList<Especialidad> especialidades = new ArrayList<>();
    public ArrayList<Incidente> incidenteslist = new ArrayList<>();

    public Tecnico(String nombre, String apellido) {
        super(nombre, apellido);
    }


}
