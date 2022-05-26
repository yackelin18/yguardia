package edu.elp.pe.yguardia.service.Impl;

import edu.elp.pe.yguardia.dao.IPersonaDao;
import edu.elp.pe.yguardia.entity.Persona;
import edu.elp.pe.yguardia.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired

    private IPersonaDao personaDao;

    @Override

    public List<Persona> ListaPersonas() {
        List<Persona> personaList =this.personaDao.findAll();
        for ( Persona persona :personaList){
            System.out.println(persona.toString());
        }
        return personaList;

    }
    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return this.personaDao.buscarPersona(dni);
    }

}
