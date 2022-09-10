package com.upn.colecciones.area;

import com.upn.colecciones.empleado.Asesor;
import com.upn.colecciones.empleado.Supervisor;

import java.util.HashSet;
import java.util.Set;

public class Area
{
    private static int contador;
    private int id;
    private String nombre;
    private Set<Asesor> asesores;
    private Supervisor supervisor;
    private TipoArea tipo;

    public Area(String nombre, TipoArea tipo)
    {
        this.id = Area.contador++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.asesores = new HashSet<>();
    }

    public void asignarSupervisor(Supervisor supervisor)
    {
        this.supervisor = supervisor;
    }

    public String nombreArea()
    {
        return this.nombre;
    }

    public void agregarAsesor(Asesor aa)
    {
        this.asesores.add(aa);
    }

    public void mostrarAsesores()
    {   
        System.out.println("Lista de asesores:");
        System.out.println("*****************************");
        for (Asesor asesor : this.asesores)
        {
            System.out.println(asesor.infoAsesor());
        }
        System.out.println("*****************************");
    }

    public int cantAsesores()
    {
        return this.asesores.size();
    }

    public void informacionArea()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("===============================================\n");
        sb.append("El área "+ this.nombreArea());
        sb.append(" tiene " + this.cantAsesores() + " asesores.");
        sb.append("\n===============================================");
        System.out.println(sb);
    }

    public void quitarAsesor(String id) 
    {
        if (asesores.remove(buscarPorDNI(id))) {
            System.out.println("Asesor removido del área.");
        } else {
            System.out.println("El asesor no se encuentra en esta área.");
        }
    }

    private Asesor buscarPorDNI(String id)
    {
        for (Asesor asesor : asesores)
        {
            if(asesor.obtenerId().equals(id))
            {
                return asesor;
            }
        }
        return null;
    }
}
