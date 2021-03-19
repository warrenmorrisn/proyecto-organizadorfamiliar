package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int idUser;

    @Column
    private String user;

    @Column
    private String password;

    @OneToOne
    private Role role;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name="id_user"), inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles;

    public Usuario() {
    }

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Usuario(int idUser, String user, String password, Role role) {
        this.idUser = idUser;
        this.user = user;
        this.password = password;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getIdUser() == usuario.getIdUser() && getUser().equals(usuario.getUser()) && getPassword().equals(usuario.getPassword()) && getRole().equals(usuario.getRole()) && getRoles().equals(usuario.getRoles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUser(), getUser(), getPassword(), getRole(), getRoles());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUser=" + idUser +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", roles=" + roles +
                '}';
    }

}