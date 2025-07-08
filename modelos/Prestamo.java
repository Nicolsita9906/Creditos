package credito.modelos;
public class Prestamo {
    String identificacionCliente;
    String fechaPrestamo;
    String montoPrestamo;
    String montoInteres;
    String estadoPrestamo;
    String fechaPago;
    int id;

    public Prestamo(String identificacionCliente, String fechaPrestamo, String montoPrestamo, String montoInteres, String estadoPrestamo, String fechaPago, int id) {
        this.identificacionCliente = identificacionCliente;
        this.fechaPrestamo = fechaPrestamo;
        this.montoPrestamo = montoPrestamo;
        this.montoInteres = montoInteres;
        this.estadoPrestamo = estadoPrestamo;
        this.fechaPago = fechaPago;
        this.id = id;
    }
    public String getIdentificacionCliente() {
        return identificacionCliente;
    }
    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public String getMontoPrestamo() {
        return montoPrestamo;
    }
    public void setMontoPrestamo(String montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }
    public String getMontoInteres() {
        return montoInteres;
    }
    public void setMontoInteres(String montoInteres) {
        this.montoInteres = montoInteres;
    }
    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }
    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }   
    public String getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Prestamo{" +
                "identificacionCliente='" + identificacionCliente + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", montoPrestamo='" + montoPrestamo + '\'' + 
                ", montoInteres='" + montoInteres + '\'' +
                ", estadoPrestamo='" + estadoPrestamo + '\'' +
                ", fechaPago='" + fechaPago + '\'' +
                ", id=" + id +
                '}';
    }
}
