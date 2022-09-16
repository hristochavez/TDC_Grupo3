package com.upn.colecciones.main;

import com.upn.colecciones.rol.Admin;
import com.upn.colecciones.rol.Rol;
import com.upn.colecciones.rol.SuperAdmin;
import com.upn.colecciones.empleado.RRHH;
import com.upn.colecciones.empleado.Supervisor;;

public class Main {
    public static void main(String[] args)
    {
        Admin admin = new Admin();
        SuperAdmin sAdmin = new SuperAdmin();

        Supervisor empSuper = new Supervisor("74576066", "Andy", "Chavez", 
            "Huertas", admin);
        
        RRHH empRRHH = new RRHH("75328598", "Rosmery", "Yalico", "Chavarria", 
            sAdmin);

        
    }
}
