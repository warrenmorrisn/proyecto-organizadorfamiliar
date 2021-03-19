package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;


@Entity
@Table
public class Persona extends Usuario {

    @Column
    private String name;

    @Column
    private String apellido;

    @Column
    private Date fechaNac;

    @Column
    private String genero;

    @Column
    private String ciudad;

    @Column
    private String provincia;

    @Column
    private String pais;

    @Column
    private String email;

    public Persona() {
    }

    public Persona(String name, String apellido, Date fechaNac, String genero, String ciudad, String provincia, String pais, String email) {
        this.name = name;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.email = email;
    }

    public Persona(String user, String password) {
        super(user, password);
    }

    public Persona(String user, String password, String name, String apellido, Date fechaNac, String genero, String ciudad, String provincia, String pais, String email) {
        super(user, password);
        this.name = name;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        if (!super.equals(o)) return false;
        Persona persona = (Persona) o;
        return getName().equals(persona.getName()) && getApellido().equals(persona.getApellido()) && getFechaNac().equals(persona.getFechaNac()) && getGenero().equals(persona.getGenero()) && getCiudad().equals(persona.getCiudad()) && getProvincia().equals(persona.getProvincia()) && getPais().equals(persona.getPais()) && getEmail().equals(persona.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getApellido(), getFechaNac(), getGenero(), getCiudad(), getProvincia(), getPais(), getEmail());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac=" + fechaNac +
                ", genero='" + genero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
