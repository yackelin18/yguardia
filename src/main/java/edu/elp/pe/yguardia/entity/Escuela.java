package edu.elp.pe.yguardia.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idescuela;

    private String codigo;

    private String denominacion;

    //@OneToMany(mappedBy = "escuela", fetch = FetchType.LAZY)
    //@JsonIgnore
    //private List<Estudiante> estudianteLis;

    public Escuela() {
    }

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public Escuela(String codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
