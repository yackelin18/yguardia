package edu.elp.pe.yguardia.dao;

import edu.elp.pe.yguardia.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    @Query("SELECT p FROM Estudiante p WHERE p.codigo")
    Estudiante  buscarEstudiante (String codigo);
}
