package ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.model;

import java.io.Serializable;
import javax.persistence.*;

public class Contenido implements Serializable {
    
    private static final long serialVersionUID = 1543L;
    @Id
    @Column(name = "cod_contenido", nullable = false)
    private String codContenido;
    
    @Column(name = "tipo_contenido", precision = 2, scale = 0)
    private String tipoContenido;
    
    @Column(name = "nombre", nullable = false, length = 256)
    private String nombre;
    
    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;
    
    @Version
    @Column(name = "version", precision = 4, scale = 2)
    private String version;

    @Column(name = "estado", nullable = false)
    private String estado;
    
    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido", nullable = false, insertable = false ,updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;
    
    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

}
