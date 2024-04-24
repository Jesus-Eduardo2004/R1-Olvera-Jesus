package mx.utng.jeoh.model.dao;

import java.util.List;

import mx.utng.jeoh.model.entity.RegistroPrecionArterial;

public interface IRegistroPrecionArterialDao {
    List<RegistroPrecionArterial> list();
    void save(RegistroPrecionArterial registroPrecionArterial);
    RegistroPrecionArterial getById(Long id);
    void delete(Long id);
}
