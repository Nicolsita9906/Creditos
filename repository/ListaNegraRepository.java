package credito.repository;

import credito.modelos.ListaNegra;
import java.util.ArrayList;
import java.util.List;

public class ListaNegraRepository {
    private List<ListaNegra> registros = new ArrayList<>();

    public void agregar(ListaNegra bloqueo) {
        registros.add(bloqueo);
    }

    public boolean estaBloqueado(String cedulaCliente) {
        return registros.stream()
                        .anyMatch(b -> b.getIdentificacionCliente().equals(cedulaCliente));
    }

    public void desbloquear(String cedulaCliente) {
        registros.removeIf(b -> b.getIdentificacionCliente().equals(cedulaCliente));
    }

    public void listarBloqueados() {
        registros.forEach(System.out::println);
    }
}
