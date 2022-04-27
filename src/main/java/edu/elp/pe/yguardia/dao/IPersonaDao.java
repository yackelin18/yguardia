package edu.elp.pe.yguardia.dao;


import edu.elp.pe.yguardia.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository <Persona,Long> {
    @Query("SELECT p FROM Persona p WHERE p.nombre")
    Persona buscarPersona(String nombre);
}
