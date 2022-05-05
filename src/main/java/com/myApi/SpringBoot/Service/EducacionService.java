package com.myApi.SpringBoot.Service;

import com.myApi.SpringBoot.Model.Educacion;
import com.myApi.SpringBoot.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
 @Autowired
 EducacionRepository repositorioEducacion;
 
  public Educacion obtenerEducacion(Long id)
    {
        return repositorioEducacion.findById(id).orElse(null);
    }

 @Override
    public List<Educacion> listarEducacion() {

        return repositorioEducacion.findAll();
    }
 @Override
    public void crearEducacion(Educacion educacion) {
        repositorioEducacion.save(educacion);
    }

 @Override
    public void borrarEducacion(Long id) {
        repositorioEducacion.deleteById(id);
    }
    
   public void modificarEducacion(Educacion educacion)
    {
    repositorioEducacion.save(educacion);
    }
   public List<Educacion> buscarEducacionPorTitulo(String titulo)
{
return repositorioEducacion.findByTituloLike(titulo);
}

 
}
