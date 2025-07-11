package credito.service;

import credito.modelos.ListaNegra;
import credito.repository.ListaNegraRepository;

public class LIstaNegraService {
    private final ListaNegraRepository listaNegraRepository;

    public LIstaNegraService(ListaNegraRepository listaNegraRepository) {
        this.listaNegraRepository = listaNegraRepository;
    }

     public void agregar(ListaNegra bloqueo) {
        listaNegraRepository.agregar(bloqueo);
    }

    public boolean estaBloqueado(String cedulaCliente) {
        return listaNegraRepository.estaBloqueado(cedulaCliente);
    }

    public void desbloquear(String cedulaCliente) {
        listaNegraRepository.desbloquear(cedulaCliente);
    }

    public void listarBloqueados() {
        listaNegraRepository.listarBloqueados();
    }

}
