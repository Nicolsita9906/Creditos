package credito.modelos;

public class ListaNegra {

    private String n_identificaionCliente;
    private String nombreCliente;
    private String motivoBloqueo;
    private String fechaBloqueo;
    private int idCliente;
    private String tiempoBloqueo;

    public ListaNegra(String n_identificaionCliente, String nombreCliente, String motivoBloqueo, String fechaBloqueo, int idCliente, String tiempoBloqueo) {
        this.n_identificaionCliente = n_identificaionCliente;
        this.nombreCliente = nombreCliente;
        this.motivoBloqueo = motivoBloqueo;
        this.fechaBloqueo = fechaBloqueo;
        this.idCliente = idCliente;
        this.tiempoBloqueo = tiempoBloqueo;
    }
    public String getN_identificaionCliente() {
        return n_identificaionCliente;
    }
    public void setN_identificaionCliente(String n_identificaionCliente) {
        this.n_identificaionCliente = n_identificaionCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getMotivoBloqueo() {
        return motivoBloqueo;
    }
    public void setMotivoBloqueo(String motivoBloqueo) {
        this.motivoBloqueo = motivoBloqueo;
    }
    public String getFechaBloqueo() {
        return fechaBloqueo;
    }
    public void setFechaBloqueo(String fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getTiempoBloqueo() {
        return tiempoBloqueo;
    }
    public void setTiempoBloqueo(String tiempoBloqueo) {
        this.tiempoBloqueo = tiempoBloqueo;
    }
    @Override
    public String toString() {
        return "ListaNegra{" +
                "n_identificaionCliente='" + n_identificaionCliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", motivoBloqueo='" + motivoBloqueo + '\'' +
                ", fechaBloqueo='" + fechaBloqueo + '\'' +
                ", idCliente=" + idCliente +
                ", tiempoBloqueo='" + tiempoBloqueo + '\'' +
                '}';
    }

}
