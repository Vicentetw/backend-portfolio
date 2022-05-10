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
public class Titulo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre_titulo;
    private int educacion_id; 

    public Titulo(Long id, String nombre_titulo, int educacion_id) {
        this.id = id;
        this.nombre_titulo = nombre_titulo;
        this.educacion_id = educacion_id;
    }

    public Titulo() {
    }
    
    
    
}
