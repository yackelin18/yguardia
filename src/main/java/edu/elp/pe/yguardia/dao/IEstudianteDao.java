package edu.elp.pe.yguardia.dao;

import edu.elp.pe.yguardia.entity.Estudiante;
import edu.elp.pe.yguardia.entity.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    @Query("SELECT p FROM Persona p WHERE p.nombre = ?1 AND p.apellido = ?2")
    Persona findByNombreAndApellido(String nombre, String apellido);

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :coddni OR e.dni = :coddni")
    Estudiante obtenerPorCodigoOrDni(@Param("coddni") String coddni);

    @Query("SELECT e FROM Estudiante e WHERE e.direccion = :direccion OR e.dirreccion = :direccion")
    Estudiante obtenerPorDireccion(@Param("direccion") String direccion);
}
