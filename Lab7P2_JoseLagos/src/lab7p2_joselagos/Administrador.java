package lab7p2_joselagos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Administrador {
    
    private ArrayList<Artistas> artistas = new ArrayList();
    private ArrayList<Canciones> canciones = new ArrayList();
    private ArrayList<Albumes> albumes = new ArrayList();
    private File archivo = null;

    public Administrador(String path) {
        archivo = new File(path);
        
    }

    public ArrayList<Artistas> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artistas> artistas) {
        this.artistas = artistas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Albumes> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Albumes> albumes) {
        this.albumes = albumes;
    }
    
    public void setArtista(Artistas a){
        this.artistas.add(a);
    }
    
    public void setAlbum(Albumes al){
        this.albumes.add(al);
    }
    
    public void setCancion(Canciones c){
        this.canciones.add(c);
    }
    
    //////////////////////////////////////////////////////////////////////
    public void cargarArtista(){
        try {
            artistas = new ArrayList();
            Artistas temp;
            
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Artistas) objeto.readObject()) != null){
                        artistas.add(temp);
                    }
                } catch (Exception e) {
                    
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void cargarAlbum(){
        try {
            albumes = new ArrayList();
            Albumes temp;
            
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Albumes) objeto.readObject()) != null){
                        albumes.add(temp);
                    }
                } catch (Exception e) {
                    
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void cargarCancion(){
        try {
            canciones = new ArrayList();
            Canciones temp;
            
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Canciones) objeto.readObject()) != null){
                        canciones.add(temp);
                    }
                } catch (Exception e) {
                    
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void escribirArtista(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            
            for (Artistas artista : artistas) {
                bw.writeObject(artista);
            }
            bw.flush();
        } catch (Exception e) {
        }
        finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void escribirAlbum(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            
            for (Albumes album : albumes) {
                bw.writeObject(album);
            }
            bw.flush();
        } catch (Exception e) {
        }
        finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void escribirCancion(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            
            for (Canciones cancion : canciones) {
                bw.writeObject(cancion);
            }
            bw.flush();
        } catch (Exception e) {
        }
        finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
