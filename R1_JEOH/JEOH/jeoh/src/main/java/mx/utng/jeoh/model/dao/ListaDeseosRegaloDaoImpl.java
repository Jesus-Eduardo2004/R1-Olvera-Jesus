package mx.utng.jeoh.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.jeoh.model.entity.ListaDeseosRegalo;

@Repository
public class ListaDeseosRegaloDaoImpl implements IListaDeseosRegaloDao{
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<ListaDeseosRegalo> list() {
        return em.createQuery("from ListaDeseosRegalo").getResultList();
    }

    @Override
    public void save(ListaDeseosRegalo listaDeseosRegalo) {
        System.out.println("ListaDeseosRegalo id="+listaDeseosRegalo.getId());
        if(listaDeseosRegalo.getId() != null && listaDeseosRegalo.getId() >0){
            em.merge(listaDeseosRegalo);
        }else{
            em.persist(listaDeseosRegalo);
        }
    }

    @Override
    public ListaDeseosRegalo getById(Long id) {
        return em.find(ListaDeseosRegalo.class, id);
    }

    @Override
    public void delete(Long id) {
        ListaDeseosRegalo listaDeseosRegalo = getById(id);
        em.remove(listaDeseosRegalo);
    }

    
}