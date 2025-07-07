public class Cliente {
    private String nombre;
    private String cedula;
    private int edad;
    private double ingresosMensuales;
    private boolean tieneCuentaBancaria;
    private boolean tieneHistorialCrediticioPositivo;
    private String correoElectronico;
    private String telefono;
    private int id;

    public Cliente(String nombre, String cedula, int edad, double ingresosMensuales, boolean tieneCuentaBancaria, boolean tieneHistorialCrediticioPositivo, String correoElectronico, String telefono, int id) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.ingresosMensuales = ingresosMensuales;
        this.tieneCuentaBancaria = tieneCuentaBancaria;
        this.tieneHistorialCrediticioPositivo = tieneHistorialCrediticioPositivo;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }
    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }
    public boolean isTieneCuentaBancaria() {
        return tieneCuentaBancaria;
    }
    public void setTieneCuentaBancaria(boolean tieneCuentaBancaria) {
        this.tieneCuentaBancaria = tieneCuentaBancaria;
    }
    public boolean isTieneHistorialCrediticioPositivo() {
        return tieneHistorialCrediticioPositivo;
    }
    public void setTieneHistorialCrediticioPositivo(boolean tieneHistorialCrediticioPositivo) {
        this.tieneHistorialCrediticioPositivo = tieneHistorialCrediticioPositivo;
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
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", ingresosMensuales=" + ingresosMensuales +
                ", tieneCuentaBancaria=" + tieneCuentaBancaria +
                ", tieneHistorialCrediticioPositivo=" + tieneHistorialCrediticioPositivo +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", id=" + id +
                '}';
    }
}
