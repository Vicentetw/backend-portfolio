
package com.myApi.SpringBoot.Controller;
import com.myApi.SpringBoot.Model.Educacion;
import com.myApi.SpringBoot.Service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = {"https://portfolio-angular-81057.web.app"})

public class EducacionController {
    
@Autowired
    EducacionService educacionService;

    @GetMapping("/educacion/todas")
    @ResponseBody
    public List<Educacion> buscarTodas()
    {
    return educacionService.listarEducacion();
    }   
    @GetMapping("/educacion")
    public String saludar(@RequestParam String titulo) {
        return "El nombre del título es: " + titulo;
    }

    @PostMapping("/educacion")
    public void crearEducacion(@RequestBody Educacion educacion) {
        educacionService.crearEducacion(educacion);
    }

    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        educacionService.borrarEducacion(id);
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

