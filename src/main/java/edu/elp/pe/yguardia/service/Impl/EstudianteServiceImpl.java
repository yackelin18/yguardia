package edu.elp.pe.yguardia.service.Impl;

import edu.elp.pe.yguardia.dao.IEstudianteDao;
import edu.elp.pe.yguardia.entity.Estudiante;
import edu.elp.pe.yguardia.entity.Persona;
import edu.elp.pe.yguardia.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired

    private IEstudianteDao estudianteDao;
    @Override
    public List<Estudiante> ListaEstudiante() {
        List<Estudiante> estudianteList =this.estudianteDao.findAll();
        for ( Estudiante estudiante :estudianteList){
            System.out.println(estudiante.toString());
        }
        return this.estudianteDao.findAll();

    }


    @Override
    public Persona obtenerEstudianteBycodigo(String codigo) {
        return null;
    }
}
