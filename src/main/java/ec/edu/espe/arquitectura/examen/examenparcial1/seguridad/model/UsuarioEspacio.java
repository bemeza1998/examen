package ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

public class UsuarioEspacio implements Serializable {
    private static final long serialVersionUID = 165465L;
    @EmbeddedId
    private UsuarioEspacioPK pk;
    
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public UsuarioEspacio() {
    }
    
    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public UsuarioEspacioPK getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pk);
        hash = 97 * hash + Objects.hashCode(this.estado);
        hash = 97 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioEspacio other = (UsuarioEspacio) obj;
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return Objects.equals(this.usuario, other.usuario);
    }

    @Override
    public String toString() {
        return "{" + "pk=" + pk + ", estado=" + estado + ", usuario=" + usuario + '}';
    }
    
    
}
