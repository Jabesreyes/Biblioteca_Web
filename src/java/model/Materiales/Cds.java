
package model.Materiales;

public class Cds {
    private String codigoidentificacion;
    private String titulo;
    private String artista;
    private String genero;
    private String duracion;
    private int numerocanciones;
    private String ubicacion;
    private int unidades;
    private int unidadesprestados;
    private int unidadesdisponibles;

    public Cds(String codigoidentificacion, String titulo, String artista, String genero, String duracion, int numerocanciones, String ubicacion, int unidades, int unidadesprestados, int unidadesdisponibles) {
        this.codigoidentificacion = codigoidentificacion;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numerocanciones = numerocanciones;
        this.ubicacion = ubicacion;
        this.unidades = unidades;
        this.unidadesprestados = unidadesprestados;
        this.unidadesdisponibles = unidadesdisponibles;
    }

    public String getCodigoidentificacion() {
        return codigoidentificacion;
    }

    public void setCodigoidentificacion(String codigoidentificacion) {
        this.codigoidentificacion = codigoidentificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getNumerocanciones() {
        return numerocanciones;
    }

    public void setNumerocanciones(int numerocanciones) {
        this.numerocanciones = numerocanciones;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getUnidadesprestados() {
        return unidadesprestados;
    }

    public void setUnidadesprestados(int unidadesprestados) {
        this.unidadesprestados = unidadesprestados;
    }

    public int getUnidadesdisponibles() {
        return unidadesdisponibles;
    }

    public void setUnidadesdisponibles(int unidadesdisponibles) {
        this.unidadesdisponibles = unidadesdisponibles;
    }
    
    
}
