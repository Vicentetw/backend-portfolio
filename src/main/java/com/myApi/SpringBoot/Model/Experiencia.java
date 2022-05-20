
package com.myApi.SpringBoot.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre_experiencia;
    private String duracion_experiencia;
    private String descripcion_experiencia;
    private int persona_id;

    public Experiencia(Long id, String nombre_experiencia, String duracion_experiencia, String descripcion_experiencia, int persona_id) {
        this.id = id;
        this.nombre_experiencia = nombre_experiencia;
        this.duracion_experiencia = duracion_experiencia;
        this.descripcion_experiencia = descripcion_experiencia;
        this.persona_id = persona_id;
    }

    public Experiencia() {
    }
    
    @Override
    public String toString(){
        return "ExperienciaLaboral{" +
                "id=" + id +
                ",nombre_experiencia=" + nombre_experiencia + '\'' +
                ", duracion_experiencia=" + duracion_experiencia +  '\'' +
                ", descripcion_experiencia=" + descripcion_experiencia +  '\'' +
                ", persona_id=" + persona_id +  '\'' +
                '}';

    }
    
}
