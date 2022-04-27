package edu.elp.pe.yguardia.entity;

import javax.persistence.*;

@Entity
@Table(name="direccion")
@PrimaryKeyJoinColumn(referencedColumnName = "IDpersona")

public class Direccion extends Persona{
    @Id
    @GeneratedValue(  strategy =GenerationType.IDENTITY )
    private long idestudiante;

    @Column(name="calle", length = 10)
    private String calle;

    @Column(name="ciudad", length = 8)
    private String ciudad;

    @Column(name="estado", length = 8)
    private String estado;

    @Column(name="codigo_postal", length = 8)
    private String codigoPostal;

    @Column(name="pais", length = 8)
    private String pais;

    public Direccion() {
    }

    public long getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(long idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public  Direccion (long idestudiante, String calle, String ciudad, String estado, String codigoPostal, String pais) {
        super(idestudiante);
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal= codigoPostal;
        this.pais = pais;
    }
}
