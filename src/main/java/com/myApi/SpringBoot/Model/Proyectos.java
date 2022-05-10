/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Proyectos {
   @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre_proyecto;
    private String descripcion_proyecto;
    private int persona_id; 

    public Proyectos(Long id, String nombre_proyecto, String descripcion_proyecto, int persona_id) {
        this.id = id;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.persona_id = persona_id;
    }

    public Proyectos() {
    }
    
    
    
}
