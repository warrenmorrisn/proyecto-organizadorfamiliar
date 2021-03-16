package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Grupo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int idGroup;

    @Column
    private String nameGroup;

    @Column
    private String descripcion;

    @ManyToOne
    private Persona persona;

    @ManyToMany
    private List<Persona> integrantesGrupo;

    //Contructor vacio
    public Grupo() {
    }

    public Grupo(int idGroup, String nameGroup, String descripcion, Persona persona, List<Persona> integrantesGrupo) {
        this.idGroup = idGroup;
        this.nameGroup = nameGroup;
        this.descripcion = descripcion;
        this.persona = persona;
        this.integrantesGrupo = integrantesGrupo;
    }

    public Grupo(int idGroup, String nameGroup, String descripcion) {
        this.idGroup = idGroup;
        this.nameGroup = nameGroup;
        this.descripcion = descripcion;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getIntegrantesGrupo() {
        return integrantesGrupo;
    }

    public void setIntegrantesGrupo(List<Persona> integrantesGrupo) {
        this.integrantesGrupo = integrantesGrupo;
    }


    //a traves del objeto de persona se agregar un participante dentro del array de grupo

    //metodo para crear grupo.
    //metodo para eliminar grupo.
    //metodo para modificar grupo.
    //metodo para añadir participante al grupo
    //metodo para elimanar participante
    //metodo para salir grupo.
    //metodo para buscar grupo.
    //metodo para visualizar grupo.





}
