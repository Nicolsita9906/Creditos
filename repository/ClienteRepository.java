package credito.repository;
import credito.modelos.Cliente;

public class ClienteRepository {

    //solicitar un prestamo
    public void solicitarPrestamo(Cliente cliente) {
        if(cliente.getEdad() < 18) {
            System.out.println("El cliente debe ser mayor de edad para solicitar un prestamo.");
            return;
        } else {
            //logica para solicitar prestamo
            System.out.println("El cliente " + cliente.getNombre() + " ha solicitado un prestamo correctamente.");
        }
    }

    //cancelar un prestamo
    public void cancelarPrestamo(Cliente cliente) {
       // if(Prestamo prestamo = cliente.getPrestamo() == null) {
            //logica para cancelar prestamo
            System.out.println("El cliente " + cliente.getNombre() + " ha cancelado un prestamo correctamente.");
       // }
    }

    //consultar estado de un prestamo
    public void consultarEstadoPrestamo(Cliente cliente) {
        //logica para consultar estado de prestamo
        System.out.println("El cliente " + cliente.getNombre() + " ha consultado el estado de su prestamo.");
    }


}
