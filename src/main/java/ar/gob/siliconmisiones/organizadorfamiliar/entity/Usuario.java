package ar.gob.siliconmisiones.organizadorfamiliar.entity;

import javax.persistence.*;
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
    public String toString() {
        return "Usuario{" +
                "idUser=" + idUser +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", roles=" + roles +
                '}';
    }

    //metodo para crear Usuario.
    //metodo para eliminar Usuario.
    //metodo para modificar Usuario.
    //metodo para visualizar Usuario.(Info).


}