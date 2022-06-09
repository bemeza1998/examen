package ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.dao;

import ec.edu.espe.arquitectura.examen.examenparcial1.gestorcontenidos.model.ContenidoVersion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContenidoVersionRepository extends JpaRepository<ContenidoVersion, Integer>{
    
}
