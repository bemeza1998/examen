/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author Bryan
 */
public class ContenidoVersion implements Serializable {

    private static final long serialVersionUID = 12345L;

    @Id
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;
    
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    
    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String tipo;
    
    @Column(name = "nombre_archivo",nullable = false, length = 256)
    private String nombreArchivo;
    
    @Column(name = "tamanio",nullable = false, precision = 9, scale = 0)
    private BigDecimal tamanio;
    
    @Version
    @Column(name = "version",nullable = false, precision = 4, scale = 2)
    private BigDecimal version;
    
    @Column(name = "comentario",nullable = false, length = 500)
    private String comentario;
    
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;
    
    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public ContenidoVersion(Integer codContenidoVersion, String tipo) {
        this.codContenidoVersion = codContenidoVersion;
        this.tipo = tipo;
    }
    
    public ContenidoVersion() {
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigDecimal tamanio) {
        this.tamanio = tamanio;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.codContenidoVersion);
        hash = 47 * hash + Objects.hashCode(this.tipo);
        hash = 47 * hash + Objects.hashCode(this.nombreArchivo);
        hash = 47 * hash + Objects.hashCode(this.tamanio);
        hash = 47 * hash + Objects.hashCode(this.version);
        hash = 47 * hash + Objects.hashCode(this.comentario);
        hash = 47 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 47 * hash + Objects.hashCode(this.codUsuarioCreacion);
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
        final ContenidoVersion other = (ContenidoVersion) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.nombreArchivo, other.nombreArchivo)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.codContenidoVersion, other.codContenidoVersion)) {
            return false;
        }
        if (!Objects.equals(this.tamanio, other.tamanio)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        return Objects.equals(this.codUsuarioCreacion, other.codUsuarioCreacion);
    }
    
    
    
}
