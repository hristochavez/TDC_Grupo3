package archivos;

public class Supervisor extends Empleado {
    public Supervisor(String id, String nombre, String apePat, String apeMat) {
        super(id, nombre, apePat, apeMat);
    }

    public String toString() {
        String resumen;
        resumen = "Supervisor: "+this.nombre + " " + this.apePat + " " + this.apeMat;
        resumen = resumen.concat(" CODIGO: " + this.id);
        return resumen;
    }
}
