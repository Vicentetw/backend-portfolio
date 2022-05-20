/*Perrotta Vicente Grupo 141 */
package com.myApi.SpringBoot.Controller;

import com.myApi.SpringBoot.Model.Experiencia;
import com.myApi.SpringBoot.Service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "*")
public class ExperienciaController {
    
   @Autowired
    ExperienciaService experienciaService;

    /*Método GET*/
    @GetMapping("/experiencia/todas")
    public ResponseEntity<List<Experiencia>> getAllEstudios() {
        List<Experiencia> experiencia = experienciaService.listarExperiencias();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    /*otra forma de obtener listado */
    @GetMapping("/experiencia2/all")
    @ResponseBody
    public List<Experiencia> buscarTodas() {
        return experienciaService.listarExperiencias();
    }
    
    @GetMapping ("/experiencia/obtener/{id}")
    @ResponseBody
    public Experiencia obtenerExperiencia(@PathVariable Long id) {
        return experienciaService.obtenerExperiencia(id);
    }
     @GetMapping("/experiencia/{id}")
    public ResponseEntity<Experiencia> findExperiencia(@PathVariable("id") Long id) {
        Experiencia experienciaLaboral = experienciaService.obtenerExperiencia(id);
        return new ResponseEntity<>(experienciaLaboral, HttpStatus.OK);
    }

    
    /*Método PUT*/
    @PutMapping("/modifica/experiencia")
    public void modificarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.modificarExperiencia(experiencia);
    }
 

    /*Método POST*/
    @PostMapping("/experiencia")
    public void crearExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.crearExperiencia(experiencia);
    }

    /*Método DELETE */
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        experienciaService.borrarExperiencia(id);
    } 
    
    
}
