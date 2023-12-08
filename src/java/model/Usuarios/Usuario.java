
package model.Usuarios;


public class Usuario {
    int id;
    String usuario;
    String password;
    String nombre;
    String correo;
    String last_session;
    int id_tipo;
    int doc_prestados;
    int limite;
    int mora;
    
    public Usuario(){
        
    }

    public Usuario(int id, String usuario, String password, String nombre, String correo, String last_session, int id_tipo, int doc_prestados, int limite, int mora) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.correo = correo;
        this.last_session = last_session;
        this.id_tipo = id_tipo;
        this.doc_prestados = doc_prestados;
        this.limite = limite;
        this.mora = mora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getDoc_prestados() {
        return doc_prestados;
    }

    public void setDoc_prestados(int doc_prestados) {
        this.doc_prestados = doc_prestados;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getMora() {
        return mora;
    }

    public void setMora(int mora) {
        this.mora = mora;
    }
    
        
}
