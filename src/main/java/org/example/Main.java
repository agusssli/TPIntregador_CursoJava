package org.example;

public class Main {
    public static void main(String[] args) {
        Especialidad software = new Especialidad("Software");
        Especialidad hardware = new Especialidad("Hardware");
        Especialidad redes = new Especialidad("Redes");

        Incidente incidente1 = new Incidente("Prom1", software);
        Cliente cliente1 = new Cliente("jose", "perez", 21342 , incidente1 );
        Incidente incidente2 = new Incidente("Prom2", hardware);
        Cliente cliente2 = new Cliente("maria", "reyes", 21342 , incidente2 );
        Incidente incidente3 = new Incidente("Prom3", redes);
        Cliente cliente3 = new Cliente("Lucia", "gonzales", 21342 , incidente3);

        Tecnico tecnico1 = new Tecnico("Agus", "LiBongiorno");
        tecnico1.especialidades.add(software);
        tecnico1.especialidades.add(hardware);
        tecnico1.incidenteslist.add(incidente1);


        System.out.println(tecnico1.getApellido());
        System.out.println(tecnico1.especialidades);
        System.out.println(tecnico1.incidenteslist);

    }
}