package com.banco.demo.web;

import com.banco.demo.domain.Persona;
import com.banco.demo.servicio.PersonaServicio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    private PersonaServicio personaServicio;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaServicio.Listarpersonas();
        log.info("ejecutando el controlador MVC");
        model.addAttribute("personas", personas);
        return ("index");
    }
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaServicio.guardar(persona);
        return "redirect:/";
    }

}
