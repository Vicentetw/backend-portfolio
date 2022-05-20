
package com.myApi.SpringBoot.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
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
    @Column(nullable=false, updatable=false)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String dni;
    private int id_nacionalidad;
    private int id_experiencia;    
    private int id_skill;
    private int id_proyectos;
    private String fecha_nacimiento;
    private int id_educacion;

    public Persona(Long id, String nombre, String apellido, String dni, int id_nacionalidad, int id_experiencia, int id_skill, int id_proyectos, String fecha_nacimiento, int id_educacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id_nacionalidad = id_nacionalidad;
        this.id_experiencia = id_experiencia;
        this.id_skill = id_skill;
        this.id_proyectos = id_proyectos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.id_educacion = id_educacion;
    }

   
    
      
    
       

    public Persona() {
    }

}
