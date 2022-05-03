
package com.myApi.SpringBoot.Repository;

import com.myApi.SpringBoot.Model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    public List<Persona> findByApellidoLike(String  apellido);
    
}
