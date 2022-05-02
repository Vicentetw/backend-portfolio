package com.myApi.SpringBoot.Controller;

import com.myApi.SpringBoot.Model.Persona;
import com.myApi.SpringBoot.Service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    public String saludar(@RequestParam String nombre) {
        return "Bienvenidos a Arg. Programa. Soy " + nombre;
    }

    @PostMapping("/persona")
    public void crearPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }

    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona obtenerPersona(@PathVariable Long id) {
        return personaService.obtenerPersona(id);
    }

    @PutMapping("/modifica/persona")
    public void modificarPersona(@RequestBody Persona persona) {
        personaService.modificarPersona(persona);
    }

    @GetMapping("/persona/ubicacion/{ubicacion}")
    @ResponseBody
    public List<Persona> buscarPorUbicacion(@PathVariable String ubicacion)
    {
    return personaService.buscarPersonaPorUbicacion(ubicacion);
    }
    @GetMapping("/persona/todas")
    @ResponseBody
    public List<Persona> buscarTodas()
    {
    return personaService.listarPersonas();
    }
    
    
}
