package com.upn.colecciones.main;

import java.time.LocalDateTime;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.area.TipoArea;
import com.upn.colecciones.empleado.Asesor;
import com.upn.colecciones.empleado.RRHH;
import com.upn.colecciones.horario.Horario;
import com.upn.colecciones.rol.SuperAdmin;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class Main {
    public static void main(String[] args)
    {
        
        Area area = new Area("Mi área", TipoArea.APOYO);

        Horario horario = new Horario(LocalDateTime.now(), LocalDateTime.now(), 6);

        Asesor asesor = new Asesor("74576066", "Andy", "Chavez",    "Huertas", area, TipoDocumento.DNI, horario);

        RRHH rrhh = new RRHH("12345678", "Rosmery", "Yalico", "Chavarria", TipoDocumento.DNI, horario, new SuperAdmin());

        System.out.println(asesor.obtenerNombre());

        rrhh.actualizarNombre(asesor, "Hristo");

        System.out.println(asesor.obtenerNombre());
    }
}
