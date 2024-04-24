package mx.utng.jeoh.model.service;

import mx.utng.jeoh.model.entity.ListaDeseosRegalo;
import java.util.List;

public interface IListaDeseosRegaloService {
    List<ListaDeseosRegalo> list();
    void save(ListaDeseosRegalo listaDeseosRegalo);
    ListaDeseosRegalo getById(Long id);
    void delete(Long id);
}
