/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.dao;

import ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.model.UsuarioEspacio;
import ec.edu.espe.arquitectura.examen.examenparcial1.seguridad.model.UsuarioEspacioPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK>{
    List<UsuarioEspacio> findByEstado(String estado);
}
