
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
public class Educacion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(nullable=false, updatable=false)
    private Long id;
    @Basic
    private String fecha_inicio;
    private String fecha_egreso;
    private String titulo;
    private String Institucion;
    private int persona_id;

    public Educacion() {
    }

    
    
    /*@Override
    public String toString(){
        return "Educacion{" +
                "id=" + id +
                ", fechaInicio='" + fecha_inicio + '\'' +
                ", fechaEgreso='" + fecha_egreso + '\'' +
                ", titulo='" + titulo + '\'' +
                ", Institucion='" + Institucion + '\'' +
                ", url persona='" + persona + '\'' +
                '}';
    }
*/

    public Educacion(Long id, String fecha_inicio, String fecha_egreso, String titulo, String Institucion, int persona_id) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_egreso = fecha_egreso;
        this.titulo = titulo;
        this.Institucion = Institucion;
        this.persona_id = persona_id;
    }
}
