package mx.utng.jeoh.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.jeoh.model.dao.IListaDeseosRegaloDao;
import mx.utng.jeoh.model.entity.ListaDeseosRegalo;

@Service
public class ListaDeseosRegaloServiceImpl implements IListaDeseosRegaloService{

    @Autowired
    private IListaDeseosRegaloDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<ListaDeseosRegalo> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(ListaDeseosRegalo listaDeseosRegalo) {
        dao.save(listaDeseosRegalo);
    }

    @Transactional(readOnly = true)
    @Override
    public ListaDeseosRegalo getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
   
}
