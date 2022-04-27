package edu.elp.pe.yguardia.entity;


import javax.persistence.*;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDpersona")

public class Estudiante extends Persona {
    @Id
    @GeneratedValue(  strategy =GenerationType.IDENTITY )
    private long idestudiante;

    @Column(name="codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name="serie", length = 8)
    private String serie;

    public Estudiante() {
    }

    public long getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(long idestudiante) {
        this.idestudiante = idestudiante;
    }
    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;

    }
}
