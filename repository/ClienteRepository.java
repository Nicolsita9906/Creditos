package credito.repository;

import credito.modelos.Cliente;
import credito.modelos.Prestamo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 //Operaciones básicas sobre clientes y sus préstamos. 
public class ClienteRepository {

    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Prestamo> prestamos = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void solicitarPrestamo(Cliente cliente, Prestamo prestamo) {
        if (cliente.getEdad() < 18) {
            System.out.println("El cliente debe ser mayor de edad.");
            return;
        }
        if (!cliente.isTieneHistorialCrediticioPositivo()) {
            System.out.println("Historial negativo: préstamo rechazado.");
            return;
        }
        prestamos.add(prestamo);
        System.out.println("Préstamo solicitado correctamente.");
    }

    public void cancelarPrestamo(int prestamoId) {
        prestamos.removeIf(p -> p.getId() == prestamoId);
    }

    public void consultarEstadoPrestamo(int prestamoId) {
        Optional<Prestamo> p = prestamos.stream()
                                        .filter(pr -> pr.getId() == prestamoId)
                                        .findFirst();
        System.out.println(p.map(Prestamo::getEstadoPrestamo)
                            .orElse("No existe préstamo con id " + prestamoId));
    }

    public void listarClientes() {
        clientes.forEach(System.out::println);
    }
}
