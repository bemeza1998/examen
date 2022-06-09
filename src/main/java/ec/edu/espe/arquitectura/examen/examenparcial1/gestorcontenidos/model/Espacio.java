package ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

public class Espacio implements Serializable {

    private static final long serialVersionUID = 12345L;
    
    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }
    
    public Espacio() {
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codEspacio);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.fechaCreacion);
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
        final Espacio other = (Espacio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.codEspacio, other.codEspacio)) {
            return false;
        }
        return Objects.equals(this.fechaCreacion, other.fechaCreacion);
    }
    
    
}
