
package com.banco.demo.servicio;

import com.banco.demo.dao.IpersonaDao;
import com.banco.demo.domain.Persona;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class personaServicioImplementacion implements PersonaServicio {
    
    @Autowired
    private IpersonaDao IpersonaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> Listarpersonas() {
        return (List<Persona>) IpersonaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        IpersonaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        IpersonaDao.delete(persona);
    }

    

    @Override
    @Transactional(readOnly = true)
    public Persona buscarpersona(Persona persona) {
       return IpersonaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
