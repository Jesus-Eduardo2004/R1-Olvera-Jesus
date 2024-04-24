package mx.utng.jeoh.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.jeoh.model.dao.IRegistroPrecionArterialDao;
import mx.utng.jeoh.model.entity.RegistroPrecionArterial;

@Service
public class RegistroPrecionArterialServiceImpl implements IRegistroPrecionArterialService{

    @Autowired
    private IRegistroPrecionArterialDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<RegistroPrecionArterial> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(RegistroPrecionArterial registroPrecionArterial) {
        dao.save(registroPrecionArterial);
    }

    @Transactional(readOnly = true)
    @Override
    public RegistroPrecionArterial getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
   
}
