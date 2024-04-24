package mx.utng.jeoh.model.service;

import mx.utng.jeoh.model.entity.RegistroActividadFisica;
import java.util.List;

public interface IRegistroActividadFisicaService {
    List<RegistroActividadFisica> list();
    void save(RegistroActividadFisica registroActividadFisica);
    RegistroActividadFisica getById(Long id);
    void delete(Long id);
}
