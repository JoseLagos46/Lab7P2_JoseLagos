package lab7p2_joselagos;

import java.util.ArrayList;

public class Albumes {
    
    private String nombre;
    private String fecha_p;
    private String genero;
    private String formato;
    private String alias_p;
    private ArrayList <Canciones> canciones = new ArrayList();

    public Albumes() {
    }

    public Albumes(String nombre, String fecha_p, String genero, String formato, String alias_p) {
        this.nombre = nombre;
        this.fecha_p = fecha_p;
        this.genero = genero;
        this.formato = formato;
        this.alias_p = alias_p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAlias_p() {
        return alias_p;
    }

    public void setAlias_p(String alias_p) {
        this.alias_p = alias_p;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }
    
    public void setCancion(Canciones c){
        this.canciones.add(c);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
