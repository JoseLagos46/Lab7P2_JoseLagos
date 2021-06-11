package lab7p2_joselagos;

import java.util.ArrayList;

public class Artistas {
    private String nombre;
    private String genero;
    private String disquera;
    private String alias;
    private String cancion;
    
    ArrayList<Albumes> albumes = new ArrayList();

    public Artistas() {
    }

    public Artistas(String nombre, String genero, String disquera, String alias, String cancion) {
        this.nombre = nombre;
        this.genero = genero;
        this.disquera = disquera;
        this.alias = alias;
        this.cancion = cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public ArrayList<Albumes> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Albumes> albumes) {
        this.albumes = albumes;
    }

    public void setAlbum(Albumes a){
        this.albumes.add(a);
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
