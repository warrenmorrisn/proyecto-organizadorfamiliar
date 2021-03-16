package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import javax.persistence.*;

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

    //cuando dentro de un grupo crado se agrega una persona cambia el estado y se notifica a traves de un mensaje
    //que se agrego un participante con el usuario de la persona que lo agrego



    //metodo para ver tareas;
    //metodo para visualizar "añadido de grupo"
    //metodo para enviar notificion respecto a un parametro (Cambio de estado);
    //metodo de asignacion de tarea (otro usuario);
    //metodo recordatorio tarea;

}
