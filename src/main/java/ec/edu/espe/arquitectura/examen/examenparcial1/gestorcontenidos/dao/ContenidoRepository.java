package ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.dao;

import ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.model.Contenido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContenidoRepository extends JpaRepository<Contenido, Integer>{
    List<Contenido> findByEstado(String estado);
    List<Contenido> findByNombreLike (String nombrePattern);
}
