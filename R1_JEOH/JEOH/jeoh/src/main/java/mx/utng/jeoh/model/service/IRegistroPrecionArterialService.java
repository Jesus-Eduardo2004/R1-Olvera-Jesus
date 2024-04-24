package mx.utng.jeoh.model.service;

import mx.utng.jeoh.model.entity.RegistroPrecionArterial;
import java.util.List;

public interface IRegistroPrecionArterialService {
    List<RegistroPrecionArterial> list();
    void save(RegistroPrecionArterial registroPrecionArterial);
    RegistroPrecionArterial getById(Long id);
    void delete(Long id);
}
