package edu.elp.pe.yguardia.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDpersona")

public class Estudiante extends Persona {
    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 8)
    private String serie;


    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Escuela escuela;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, String estadoEgreso, Escuela escuela) {
        this.codigo = codigo;
        this.serie = serie;

    }

    public Estudiante(Long idpersona, String codigo, String serie, String estadoEgreso, Escuela escuela) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;

    }

    public Estudiante(  String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
}
