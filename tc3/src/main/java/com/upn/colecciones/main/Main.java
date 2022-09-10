package com.upn.colecciones.main;

import java.util.Scanner;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.area.TipoArea;
import com.upn.colecciones.campania.Campania;
import com.upn.colecciones.empleado.Asesor;
import com.upn.colecciones.empleado.Supervisor;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Creación de supervisores
        Supervisor sa = new Supervisor("00000000", "David", "Robert", "Jones");
        Supervisor sb = new Supervisor("00000001", "Elthon", "Jhon", "Vasquez");

        //Creación de asesores
        Asesor aa = new Asesor("74576066", "Hristo", "Chavez", "Huertas");
        Asesor ab = new Asesor("75328598", "Rosmery", "Yalico", "Chavarria");
        Asesor ac = new Asesor("09747677", "Janeth", "Huertas", "Reyes");
        Asesor ad = new Asesor("12345678", "Carina", "Yalico", "Chavarria");

        Asesor ae = new Asesor("99999999", "Maria", "Perez", "Ramirez");
        Asesor af = new Asesor("75328598", "Edgar", "Román", "Sanchez");
        Asesor ag = new Asesor("09747677", "Luis", "Tasayco", "Farfán");

        //Creacion de campaña
        Campania c = new Campania("Postpago Claro Perú");

        //Creación de área
        Area a1 = new Area("Gestores de conocimiento", TipoArea.APOYO);
        Area a2 = new Area("Servidores", TipoArea.OPERACIONES);

        //Agregar áreas a campaña
        c.agregarArea(a1);
        c.agregarArea(a2);

        //Se le asigna supervisor
        a1.asignarSupervisor(sa);
        a2.asignarSupervisor(sb);

        //Agregar asesores a una área
        a1.agregarAsesor(aa);
        a1.agregarAsesor(ab);
        a1.agregarAsesor(ac);
        a1.agregarAsesor(ad);

        a2.agregarAsesor(ae);
        a2.agregarAsesor(af);
        a2.agregarAsesor(ag);

        //Mostrar información del área
        a1.informacionArea();
        a1.mostrarAsesores();

        //Remover a un asesor del área
        System.out.print("Introduzca el DNI a quitar de la campaña: ");
        String id = input.nextLine();
        a1.quitarAsesor(id);

        //Mostrar el estado del área
        a1.informacionArea();
        a1.mostrarAsesores();

        //Mostrar el estado de una campaña
        c.informacionCampania();

        input.close();
    }
}
