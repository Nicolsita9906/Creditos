package credito.repository;

import credito.modelos.Prestamo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PrestamoRepository {

    private final List<Prestamo> prestamos = new ArrayList<>();

    public void registrarPrestamo(Prestamo p) { prestamos.add(p); }

    public Optional<Prestamo> buscarPorId(int id) {
        return prestamos.stream().filter(p -> p.getId() == id).findFirst();
    }

    public void actualizarEstado(int id, String nuevoEstado) {
        buscarPorId(id).ifPresentOrElse(
            p -> { p.setEstadoPrestamo(nuevoEstado); },
            () -> System.out.println("Id no encontrado")
        );
    }

    public void listarPrestamos() { prestamos.forEach(System.out::println); }
}
