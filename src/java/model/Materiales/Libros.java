
package model.Materiales;


public class Libros {

    private String codigoidentificacion;
    private String titulo;
    private String autor;
    private int paginas;
    private String editorial;
    private String isbn;
    private String fechapublicacion;
    private String ubicacion;
    private int unidades;
    private int unidadesprestados;
    private int unidadesdisponibles;

    public  Libros(String codigoidentificacion, String titulo, String autor, int paginas, String editorial, String isbn, String fechapublicacion, String ubicacion, int unidades, int unidadesprestados, int unidadesdisponibles){
        this.codigoidentificacion = codigoidentificacion;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
        this.isbn = isbn;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
