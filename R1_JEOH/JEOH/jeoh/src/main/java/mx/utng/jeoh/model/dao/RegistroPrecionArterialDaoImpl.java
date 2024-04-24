package mx.utng.jeoh.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.jeoh.model.entity.RegistroPrecionArterial;

@Repository
public class RegistroPrecionArterialDaoImpl implements IRegistroPrecionArterialDao{
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<RegistroPrecionArterial> list() {
        return em.createQuery("from RegistroPrecionArterial").getResultList();
    }

    @Override
    public void save(RegistroPrecionArterial registroPrecionArterial) {
        System.out.println("RegistroPrecionArterial id="+registroPrecionArterial.getId());
        if(registroPrecionArterial.getId() != null && registroPrecionArterial.getId() >0){
            em.merge(registroPrecionArterial);
        }else{
            em.persist(registroPrecionArterial);
        }
    }

    @Override
    public RegistroPrecionArterial getById(Long id) {
        return em.find(RegistroPrecionArterial.class, id);
    }

    @Override
    public void delete(Long id) {
        RegistroPrecionArterial registroPrecionArterial = getById(id);
        em.remove(registroPrecionArterial);
    }

    
}