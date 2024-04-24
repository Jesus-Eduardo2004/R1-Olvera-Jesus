package mx.utng.jeoh.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.jeoh.model.entity.RegistroActividadFisica;

@Repository
public class RegistroActividadFisicaDaoImpl implements IRegistroActividadFisicaDao{
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<RegistroActividadFisica> list() {
        return em.createQuery("from RegistroActividadFisica").getResultList();
    }

    @Override
    public void save(RegistroActividadFisica registroActividadFisica) {
        System.out.println("RegistroActividadFisica id="+registroActividadFisica.getId());
        if(registroActividadFisica.getId() != null && registroActividadFisica.getId() >0){
            em.merge(registroActividadFisica);
        }else{
            em.persist(registroActividadFisica);
        }
    }

    @Override
    public RegistroActividadFisica getById(Long id) {
        return em.find(RegistroActividadFisica.class, id);
    }

    @Override
    public void delete(Long id) {
        RegistroActividadFisica registroActividadFisica = getById(id);
        em.remove(registroActividadFisica);
    }

    
}