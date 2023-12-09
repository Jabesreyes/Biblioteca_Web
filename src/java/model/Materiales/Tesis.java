
package model.Materiales;


public class Tesis {
    private String codigoidentificacion;
    private String titulo;
    private String autor;
    private String facultad;
    private String fechapublicacion;
    private String ubicacion;
    private int unidades;
    private int unidadesprestados;
    private int unidadesdisponibles;

    public Tesis(String codigoidentificacion, String titulo, String autor, String facultad, String fechapublicacion, String ubicacion, int unidades, int unidadesprestados, int unidadesdisponibles) {
        this.codigoidentificacion = codigoidentificacion;
        this.titulo = titulo;
        this.autor = autor;
        this.facultad = facultad;
        this.fechapublicacion = fechapublicacion;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
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
