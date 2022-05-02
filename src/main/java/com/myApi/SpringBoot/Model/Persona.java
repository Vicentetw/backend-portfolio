
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
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String nombre;
    String apellido;
    String dni;
    int id_nacionalidad;
    int id_experiencia;
    int id_skill;
    int id_proyectos;
    String fecha_nacimiento;

    public Persona(Long id, String nombre, String apellido, String dni, int id_nacionalidad, int id_experiencia, int id_skill, int id_proyectos, String fecha_nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id_nacionalidad = id_nacionalidad;
        this.id_experiencia = id_experiencia;
        this.id_skill = id_skill;
        this.id_proyectos = id_proyectos;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
       

    public Persona() {
    }

}
