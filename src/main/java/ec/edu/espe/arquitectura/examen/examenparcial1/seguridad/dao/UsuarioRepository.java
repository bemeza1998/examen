package ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.dao;

import ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    List<Usuario> findByEstado(String estado);
    List<Usuario> findByNombreLike(String nombrePattern);
}
