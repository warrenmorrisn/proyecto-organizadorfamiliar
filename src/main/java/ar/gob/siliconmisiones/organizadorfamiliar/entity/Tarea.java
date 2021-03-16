package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Tarea {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int idTarea;

    @Column
    private String titulo;

    @Column
    private String descripcion;

    @Column
    private String categoria;

    @Column
    private Date fechaTarea;

    @Column
    private boolean estado;

    @ManyToOne
    private Grupo group;

    @ManyToOne
    private Persona persona;

    @ManyToMany
    private List<Persona> asignacionMultiple;

    public Tarea() {
    }

    public Tarea(int idTarea, String titulo, String descripcion, String categoria, Date fechaTarea,
                 boolean estado, Grupo group, Persona persona, List<Persona> asignacionMultiple) {
        this.idTarea = idTarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fechaTarea = fechaTarea;
        this.estado = estado;
        this.group = group;
        this.persona = persona;
        this.asignacionMultiple = asignacionMultiple;
    }

    public Tarea(int idTarea, String titulo, String descripcion, String categoria, Date fechaTarea, boolean estado) {
        this.idTarea = idTarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fechaTarea = fechaTarea;
        this.estado = estado;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public Date getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Grupo getGroup() {
        return group;
    }

    public void setGroup(Grupo group) {
        this.group = group;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getAsignacionMultiple() {
        return asignacionMultiple;
    }

    public void setAsignacionMultiple(List<Persona> asignacionMultiple) {
        this.asignacionMultiple = asignacionMultiple;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "idTarea=" + idTarea +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", fechaTarea=" + fechaTarea +
                ", estado=" + estado +
                ", group=" + group +
                ", persona=" + persona +
                ", asignacionMultiple=" + asignacionMultiple +
                '}';
    }

    //metodo para crear tarea.
    //metodo para eliminar tarea.
    //metodo para modificar tarea.
        //para asignar participante a la tarea.//
        //para modificar participante en la tarea.
    //metodo para estado de tarea.
    //metodo para buscar tarea.
    //metodo para visualizar tarea. (hechas y en ejecucion, todas).



    //Basarse en la hora y fecha del sistema.
    //metodo para calcular el tiempo historico.
    //metodo para calcular el tiempo promedio.
    //metodo para calcular el tiempo de ejecucion.










}
