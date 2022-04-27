package edu.elp.pe.yguardia.entity;

import javax.persistence.*;

@Entity
@Table(name="PERSONA")
@Inheritance( strategy = InheritanceType.JOINED)

public class Persona {

    @Id
    @GeneratedValue(  strategy =GenerationType.IDENTITY )
    private long idpersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "telefono", length = 10)
    private String telefono;

    @Column(name = "e-mail")
    private String email;

    public Persona() {
    }
    public Persona(long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(long idpersona, String nombre, String telefono,  String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email=" + email +
                '}';
    }

    public long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
