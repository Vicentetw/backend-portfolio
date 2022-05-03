package com.myApi.SpringBoot.Service;

import com.myApi.SpringBoot.Model.Educacion;
import com.myApi.SpringBoot.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
 @Autowired
 EducacionRepository repositorioEducacion;
 
  public Educacion obtenerEducacion(Long id)
    {
        return repositorioEducacion.findById(id).orElse(null);
    }

    public List<Educacion> listarEducacion() {

        return repositorioEducacion.findAll();
    }
}
