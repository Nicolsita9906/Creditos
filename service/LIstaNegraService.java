package credito.service;

import credito.model.LListaNegra;
import credito.repository.LListaNegraRepository;

public class LIstaNegraService {
    private final LListaNegraRepository listaNegraRepository;

    public LIstaNegraService(LListaNegraRepository listaNegraRepository) {
        this.listaNegraRepository = listaNegraRepository;
    }

    public LIstaNegraService(LListaNegraRepository listaNegraRepository) {
        this.listaNegraRepository = listaNegraRepository;
    }

    public LListaNegra agregarAListaNegra(LListaNegra listaNegra) {
        return listaNegraRepository.save(listaNegra);
    }

    public LListaNegra obtenerPorId(Long id) {
        return listaNegraRepository.findById(id).orElse(null);
    }

    public void eliminarDeListaNegra(Long id) {
        listaNegraRepository.deleteById(id);
    }

}
