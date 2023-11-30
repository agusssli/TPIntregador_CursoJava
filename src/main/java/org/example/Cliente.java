package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Cliente extends Persona{
    @Getter
    @Setter
    private Integer cuit;
    private CanalNotificacion canalNotificacion;
    public ArrayList<Notificacion> notificaciones = new ArrayList<>();


    //Constructor
    public Cliente(String nombre, String apellido, Integer cuit, CanalNotificacion cnot) {
        super(nombre, apellido);
        this.canalNotificacion = cnot;
        this.cuit = cuit;
    }


}
