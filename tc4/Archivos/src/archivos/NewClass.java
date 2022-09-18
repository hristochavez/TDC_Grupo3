
package archivos;

import java.io.*;
import java.io.File;

public class NewClass {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void buscar(String archivox, String dni) {
        File archivo = new File(archivox);

        try {
            if (archivo.exists()) {
                BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
                String lineaLeida;
                while ((lineaLeida = leerArchivo.readLine()) != null) {
                    String[] palabras = lineaLeida.split(" ");
                    for (int i = 0; i < palabras.length; i++) {
                        if (palabras[i].equals(dni)) {
                            System.out.println(lineaLeida);
                        }
                    }
                }
                leerArchivo.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registrar(String nombreArchivo, Area contenido) {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se registro el area");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void registrar(String nombreArchivo, Asesor contenido) {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se registro el asesor");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void registrar(String nombreArchivo, Supervisor contenido) {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se registro el supervisor");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void listar(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        try {
            BufferedReader bf = new BufferedReader(new FileReader(archivo));
            String bfRead;

            while ((bfRead = bf.readLine()) != null) {
                System.out.println(bfRead);
            }
            bf.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void eliminar(String nombreArchivo, String id) {

        try {
            File archivo = new File(nombreArchivo);
            crearArchivo("archivo.txt");
            File nuevoArchivo = new File("archivo.txt");
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            PrintWriter escribir = new PrintWriter(new FileWriter(nuevoArchivo, true));
            String lineaLeida;
            Integer n = 0;
            while ((lineaLeida = leerArchivo.readLine()) != null) {
                String[] palabras = lineaLeida.split(" ");
                if (palabras[5].equals(id)) {
                    System.out.println("Se elimino al asesor " + palabras[1]);
                    n++;
                    continue;
                }
                escribir.println(lineaLeida);
            }
            if (n == 0)
                System.out.println("Dni no encontrado ");
            leerArchivo.close();
            escribir.close();
            archivo.delete();
            nuevoArchivo.renameTo(archivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void editar(String nombreArchivo, String id, String nuevoNombre) {

        try {
            File archivo = new File(nombreArchivo);
            File nuevoArchivo = new File("C:\\archivo\\archivo.txt");
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            PrintWriter escribir = new PrintWriter(new FileWriter(nuevoArchivo, true));
            String lineaLeida;
            Integer n = 0;
            while ((lineaLeida = leerArchivo.readLine()) != null) {
                String[] palabras = lineaLeida.split(" ");
                if (palabras[5].equals(id)) {
                    String nuevaLinea = lineaLeida.replace(palabras[1], nuevoNombre);
                    escribir.println(nuevaLinea);
                    System.out.println("Se edito correctamente ");
                    n++;
                    continue;
                }
                escribir.println(lineaLeida);
            }
            if (n == 0)
                System.out.println("Dni no encontrado ");
            leerArchivo.close();
            escribir.close();

            archivo.delete();
            nuevoArchivo.renameTo(archivo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
