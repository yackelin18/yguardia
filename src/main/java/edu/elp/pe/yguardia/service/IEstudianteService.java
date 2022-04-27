package edu.elp.pe.yguardia.service;

import edu.elp.pe.yguardia.entity.Estudiante;
import edu.elp.pe.yguardia.entity.Persona;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> ListaEstudiante();

    //Buscar estudiante por su codigo
    Persona obtenerEstudianteBycodigo(String codigo);
}
