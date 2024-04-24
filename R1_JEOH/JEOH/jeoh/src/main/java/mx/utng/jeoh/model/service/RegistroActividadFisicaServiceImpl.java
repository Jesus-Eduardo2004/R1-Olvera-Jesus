package mx.utng.jeoh.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.jeoh.model.dao.IRegistroActividadFisicaDao;
import mx.utng.jeoh.model.entity.RegistroActividadFisica;

@Service
public class RegistroActividadFisicaServiceImpl implements IRegistroActividadFisicaService{

    @Autowired
    private IRegistroActividadFisicaDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<RegistroActividadFisica> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(RegistroActividadFisica registroActividadFisica) {
        dao.save(registroActividadFisica);
    }

    @Transactional(readOnly = true)
    @Override
    public RegistroActividadFisica getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
   
}
