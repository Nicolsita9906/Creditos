package credito.service;

import credito.modelos.Cliente;
import credito.modelos.Prestamo;
import credito.repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository clienteRepository = new ClienteRepository();
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void solicitarPrestamo(Cliente cliente, Prestamo prestamo) {
        clienteRepository.solicitarPrestamo(cliente, prestamo);
    }

    public void cancelarPrestamo(int prestamoId) {
        clienteRepository.cancelarPrestamo(prestamoId);
    }

    public void consultarEstadoPrestamo(int prestamoId) {
        clienteRepository.consultarEstadoPrestamo(prestamoId);
    }

    public void listarClientes() {
        clienteRepository.listarClientes();
    }

}
