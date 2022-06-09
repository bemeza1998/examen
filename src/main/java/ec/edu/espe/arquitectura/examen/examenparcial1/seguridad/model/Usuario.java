package ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "seg_usuario", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"username"})})

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1543L;
    @Id
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
       
    @Column(name = "username", nullable = false, length = 32)
    private String userName;
    
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    
    @Column(name = "clave", nullable = false, length = 64)
    private String clave;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<UsuarioEspacio> usuarioEspacios;

    public Usuario() {
    }

    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<UsuarioEspacio> getUsuarioEspacios() {
        return usuarioEspacios;
    }

    public void setUsuarioEspacios(List<UsuarioEspacio> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ codUsuario=" + codUsuario + " ]";
    }
    
}

