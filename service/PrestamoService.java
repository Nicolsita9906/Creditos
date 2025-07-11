package credito.service;

import credito.modelos.Prestamo;
import credito.repository.PrestamoRepository;
import java.util.Optional;

public class PrestamoService {
    private final PrestamoRepository prestamoRepository;
 
    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    public Optional<Prestamo> buscarPorId(int id) {
        return prestamoRepository.buscarPorId(id);
    }

     public void actualizarEstado(int id, String nuevoEstado) {
        prestamoRepository.actualizarEstado(id, nuevoEstado);
    }

    public void listarPrestamos() {
        prestamoRepository.listarPrestamos();
    }

}
