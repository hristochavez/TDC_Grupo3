package archivos;

public class Asesor extends Empleado {
    public Asesor(String id, String nombre, String apePat, String apeMat) {
        super(id, nombre, apePat, apeMat);
    }

    public String obtenerId() {
        return this.id;
    }

    public String infoAsesor() {
        String resumen;
        resumen = this.nombre + " " + this.apePat + " " + this.apeMat;
        resumen = resumen.concat("\nDNI: " + this.id);
        return resumen;
    }

    public String infoAsesor(String id) {
        String resumen;
        resumen = this.nombre + " " + this.apePat + " " + this.apeMat;
        resumen = resumen.concat("\nDNI: " + this.id);
        return resumen;
    }

    public String toString() {
        String resumen;
        resumen = "Asesor: "+this.nombre + " " + this.apePat + " " + this.apeMat;
        resumen = resumen.concat(" DNI: " + this.id);
        return resumen;
    }

}
