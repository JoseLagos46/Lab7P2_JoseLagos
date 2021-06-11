package lab7p2_joselagos;

import java.io.Serializable;

public class DocumentoArtistas implements Serializable {
    private Artistas artista;

    public DocumentoArtistas(Artistas artista) {
        this.artista = artista;
    }

    public DocumentoArtistas() {
    }

    public Artistas getArtista() {
        return artista;
    }

    public void setArtista(Artistas artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "DocumentoArtistas{" + "artista=" + artista + '}';
    }
    
    
}
