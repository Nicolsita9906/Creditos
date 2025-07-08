package credito.modelos;
public class Empleado {
    String nombreEmpleado;
    String n_identificacion;
    String usuario;
    String contrasena;
    String correoElectronico;
    String telefono;
    int id;

    public Empleado(String nombreEmpleado, String n_identificacion, String usuario, String contrasena, String correoElectronico, String telefono, int id) {
        this.nombreEmpleado = nombreEmpleado;
        this.n_identificacion = n_identificacion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.id = id;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getN_identificacion() {
        return n_identificacion;
    }
    public void setN_identificacion(String n_identificacion) {
        this.n_identificacion = n_identificacion;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", n_identificacion='" + n_identificacion + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' + 
                ", id=" + id +
                '}';
    }
}
