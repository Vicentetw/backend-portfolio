
package com.myApi.SpringBoot.Service;

import com.myApi.SpringBoot.Model.Educacion;
import java.util.List;

public interface IEducacionService {
    public void crearEducacion (Educacion educacion);
    public void borrareducacion (Long id);
    public List <Educacion> listarEducacion();
}
