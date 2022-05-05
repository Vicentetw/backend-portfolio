
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
public class Educacion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String fechaInicio;
    String fechaEgreso;
    String titulo;
    String Institucion;
    int idPersona;

    public Educacion() {
    }

    public Educacion(Long id, String fechaInicio, String fechaEgreso, String titulo, String Institucion, int idPersona) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaEgreso = fechaEgreso;
        this.titulo = titulo;
        this.Institucion = Institucion;
        this.idPersona = idPersona;
    }
    @Override
    public String toString(){
        return "Educacion{" +
                "id=" + id +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaEgreso='" + fechaEgreso + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha inicio='" + fechaInicio + '\'' +
                ", Institucion='" + Institucion + '\'' +
                ", url idPersona='" + idPersona + '\'' +
                '}';
    }
}
