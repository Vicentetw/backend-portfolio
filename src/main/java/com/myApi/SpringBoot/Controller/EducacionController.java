
package com.myApi.SpringBoot.Controller;
import com.myApi.SpringBoot.Model.Educacion;
import com.myApi.SpringBoot.Service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = {"https://portfolio-angular-81057.web.app"})

public class EducacionController {
    
@Autowired
    EducacionService educacionService;

    @GetMapping("/educacion")
    public String saludar(@RequestParam String nombre) {
        return "Bienvenidos a Arg. Programa. Soy " + nombre;
    }

    @GetMapping("/educacion/todas")
    @ResponseBody
    public List<Educacion> buscarTodas()
    {
    return educacionService.listarEducacion();
    }   
    
}

