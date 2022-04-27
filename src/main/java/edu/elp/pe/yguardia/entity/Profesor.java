package edu.elp.pe.yguardia.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "IDpersona")

public class Profesor extends Persona{

    @Column(name="salario", length = 7)
    private String salario;

    public Profesor() {
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
