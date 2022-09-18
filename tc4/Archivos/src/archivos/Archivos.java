package archivos;

import static archivos.NewClass.*;
import java.util.Scanner;

public class Archivos {

    public static void main(String[] args) {
        String area = "Areas.txt";
        String supervisor = "Supervisores.txt";
        String asesor = "Asesores.txt";

        // Creación de Area
        Area a1 = new Area(112, "claro");
        Area a2 = new Area(226, "movistar");
        Area a3 = new Area(265, "entel");
        Area a4 = new Area(305, "luz del sur");

        // Creación de supervisores
        Supervisor sa = new Supervisor("00000000", "David", "Robert", "Jones");
        Supervisor sb = new Supervisor("00000001", "Elthon", "Jhon", "Vasquez");

        // Creación de asesores
        Asesor aa = new Asesor("74576066", "Hristo", "Chavez", "Huertas");
        Asesor ab = new Asesor("75328598", "Rosmery", "Yalico", "Chavarria");
        Asesor ac = new Asesor("09747677", "Janeth", "Huertas", "Reyes");
        Asesor ad = new Asesor("12345678", "Carina", "Yalico", "Chavarria");

        Scanner input = new Scanner(System.in);
        System.out.println("====== Menu ======");
        System.out.println("[1]. Insertar ");
        System.out.println("[2]. Listar");
        System.out.println("[3]. Modificar");
        System.out.println("[4]. Buscar");
        System.out.println("[5]. Eliminar");
        System.out.println("[6]. Salir");
        System.out.println("Ingrese una opcion: ");
        int respuesta = input.nextInt();
        // input.close();

        switch (respuesta) {

            case 1:
                Scanner opcion0 = new Scanner(System.in);
                System.out.println("Registar: ");
                System.out.println("[1].Asesor   [2].Area   [3].Supervisor");
                int registrado = opcion0.nextInt();
                if (registrado == 1) {
                    registrar(asesor, aa);
                    registrar(asesor, ab);
                    registrar(asesor, ac);
                    registrar(asesor, ad);
                } else if (registrado == 2) {
                    registrar(area, a1);
                    registrar(area, a2);
                    registrar(area, a3);
                    registrar(area, a4);
                } else if (registrado == 3) {
                    registrar(supervisor, sa);
                    registrar(supervisor, sb);
                } else
                    System.out.println("Opcion invalida ");

                break;
            case 2:
                Scanner opcion2 = new Scanner(System.in);
                System.out.println("Listar: ");
                System.out.println("[1].Asesor   [2].Area   [3].Supervisor");
                int listado = opcion2.nextInt();
                if (listado == 1) {
                    System.out.println("Los asesores son: ");
                    listar(asesor);
                } else if (listado == 2) {
                    System.out.println("Las areas son: ");
                    listar(area);
                } else if (listado == 3) {
                    System.out.println("Los supervisores son: ");
                    listar(supervisor);
                } else
                    System.out.println("Opcion invalida ");
                break;
            case 3:
                Scanner teclado = new Scanner(System.in);
                System.out.println("Escribe el dni del asesor: ");
                String palabra = teclado.nextLine();
                System.out.println("Escribe el nuevo nombre del asesor: ");
                String nNombre = teclado.nextLine();
                editar(asesor, palabra, nNombre);
                break;
            case 4:
                Scanner teclado1 = new Scanner(System.in);
                System.out.println("Escribe el dni a buscar: ");
                String dniEnc = teclado1.nextLine();
                buscar(asesor, dniEnc);
                break;
            case 5:
                Scanner teclado2 = new Scanner(System.in);
                Scanner opcion = new Scanner(System.in);
                System.out.println("Eliminar: ");
                System.out.println("[1].Asesor   [2].Supervisor");
                int eliminado = opcion.nextInt();
                if (eliminado == 1) {
                    System.out.println("Escribe el dni del asesor: ");
                    String dni = teclado2.nextLine();
                    eliminar(asesor, dni);
                    teclado2.close();
                } else {
                    System.out.println("Escribe el dni del supervisor: ");
                    String dni = teclado2.nextLine();
                    eliminar(supervisor, dni);
                    teclado2.close();
                }

                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Opción invalida!");
        }

        // eliminar(asesor, palabra);

    }
}
