package lab7p2_joselagos;

public class Canciones {
    
    private String nombre;
    private int duracion;
    private String compositor;
    private String distribuidor;
    private String exclusiva;
    private String productor;
    private String invitado;

    public Canciones() {
    }

    public Canciones(String nombre, int duracion, String compositor, String distribuidor, String exclusiva, String productor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.compositor = compositor;
        this.distribuidor = distribuidor;
        this.exclusiva = exclusiva;
        this.productor = productor;
    }

    public Canciones(String nombre, int duracion, String compositor, String distribuidor, String exclusiva, String productor, String invitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.compositor = compositor;
        this.distribuidor = distribuidor;
        this.exclusiva = exclusiva;
        this.productor = productor;
        this.invitado = invitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getExclusiva() {
        return exclusiva;
    }

    public void setExclusiva(String exclusiva) {
        this.exclusiva = exclusiva;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
