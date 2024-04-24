package mx.utng.jeoh.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ListaDeseosRegalo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String nombre;

    @Column(length = 30)
    private String regalos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegalos() {
        return regalos;
    }

    public void setRegalos(String regalos) {
        this.regalos = regalos;
    }

    @Override
    public String toString() {
        return "ListaDeseosRegalos [id=" + id + ", nombre=" + nombre + ", regalos=" + regalos + "]";
    }

}
