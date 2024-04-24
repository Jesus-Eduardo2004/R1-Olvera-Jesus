package mx.utng.jeoh.model.dao;

import java.util.List;

import mx.utng.jeoh.model.entity.ListaDeseosRegalo;

public interface IListaDeseosRegaloDao {
    List<ListaDeseosRegalo> list();
    void save(ListaDeseosRegalo listaDeseosRegalos);
    ListaDeseosRegalo getById(Long id);
    void delete(Long id);
}
