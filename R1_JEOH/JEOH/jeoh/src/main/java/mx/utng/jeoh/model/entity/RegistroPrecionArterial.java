package mx.utng.jeoh.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistroPrecionArterial {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private Integer precionSistolica;

    @Column(length = 30)
    private Integer precionDiastolica;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrecionSistolica() {
        return precionSistolica;
    }

    public void setPrecionSistolica(Integer precionSistolica) {
        this.precionSistolica = precionSistolica;
    }

    public Integer getPrecionDiastolica() {
        return precionDiastolica;
    }

    public void setPrecionDiastolica(Integer precionDiastolica) {
        this.precionDiastolica = precionDiastolica;
    }

    @Override
    public String toString() {
        return "RegistroPrecionArterial [id=" + id + ", precionSistolica=" + precionSistolica + ", precionDiastolica="
                + precionDiastolica + "]";
    }

}
