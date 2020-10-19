
package com.banco.demo.servicio;

import com.banco.demo.domain.Persona;
import java.util.List;

public interface PersonaServicio {
    
    public List<Persona> Listarpersonas();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona buscarpersona(Persona persona);
}
