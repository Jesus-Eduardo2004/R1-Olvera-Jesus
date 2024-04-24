package mx.utng.jeoh.model.dao;

import java.util.List;

import mx.utng.jeoh.model.entity.RegistroActividadFisica;

public interface IRegistroActividadFisicaDao {
    List<RegistroActividadFisica> list();
    void save(RegistroActividadFisica registroActividadFisica);
    RegistroActividadFisica getById(Long id);
    void delete(Long id);
}
