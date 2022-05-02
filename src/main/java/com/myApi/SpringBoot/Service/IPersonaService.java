
package com.myApi.SpringBoot.Service;

import com.myApi.SpringBoot.Model.Persona;
import java.util.List;


public interface IPersonaService {

    public void crearPersona(Persona persona);
    public void borrarPersona(Long id);
    public List<Persona> listarPersonas();
 
}
