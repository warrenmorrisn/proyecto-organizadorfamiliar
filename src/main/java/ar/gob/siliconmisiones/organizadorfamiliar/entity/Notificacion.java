package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Notificacion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int idNotificacion;

    @Column
    private String descripcionNot;

    @OneToOne
    private Tarea tarea;

    //a traves del objeto de grupo se accede a la notificacion e info de la persona que lo carga
    @OneToOne
    private Grupo grupo;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, String descripcionNot, Tarea tarea, Grupo grupo) {
        this.idNotificacion = idNotificacion;
        this.descripcionNot = descripcionNot;
        this.tarea = tarea;
        this.grupo = grupo;
    }

    public Notificacion(int idNotificacion, String descripcionNot) {
        this.idNotificacion = idNotificacion;
        this.descripcionNot = descripcionNot;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public String getDescripcionNot() {
        return descripcionNot;
    }

    public void setDescripcionNot(String descripcionNot) {
        this.descripcionNot = descripcionNot;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notificacion)) return false;
        Notificacion that = (Notificacion) o;
        return getIdNotificacion() == that.getIdNotificacion() && getDescripcionNot().equals(that.getDescripcionNot()) && getTarea().equals(that.getTarea()) && getGrupo().equals(that.getGrupo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdNotificacion(), getDescripcionNot(), getTarea(), getGrupo());
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "idNotificacion=" + idNotificacion +
                ", descripcionNot='" + descripcionNot + '\'' +
                ", tarea=" + tarea +
                ", grupo=" + grupo +
                '}';
    }

}
