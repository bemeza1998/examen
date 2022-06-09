/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;

/**
 *
 * @author Bryan
 */
public class UsuarioEspacioPK implements Serializable {

    @Column(name = "cod_usuario", nullable = false)
    private String codUsuario;
    @Column(name = "cod_espacio", nullable = false)
    private String codPerfil;

    public UsuarioEspacioPK(String codUsuario, String codPerfil) {
        this.codUsuario = codUsuario;
        this.codPerfil = codPerfil;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.codUsuario);
        hash = 47 * hash + Objects.hashCode(this.codPerfil);
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
        final UsuarioEspacioPK other = (UsuarioEspacioPK) obj;
        if (!Objects.equals(this.codUsuario, other.codUsuario)) {
            return false;
        }
        return Objects.equals(this.codPerfil, other.codPerfil);
    }

    @Override
    public String toString() {
        return "PK{" + "codUsuario=" + codUsuario + ", codPerfil=" + codPerfil + '}';
    }
    
    
    
}
