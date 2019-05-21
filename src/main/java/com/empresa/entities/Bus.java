package com.empresa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bus")
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b")
    , @NamedQuery(name = "Bus.findByIdBus", query = "SELECT b FROM Bus b WHERE b.idBus = :idBus")
    , @NamedQuery(name = "Bus.findByNumerochasis", query = "SELECT b FROM Bus b WHERE b.numerochasis = :numerochasis")
    , @NamedQuery(name = "Bus.findByPlaca", query = "SELECT b FROM Bus b WHERE b.placa = :placa")
    , @NamedQuery(name = "Bus.findByModelo", query = "SELECT b FROM Bus b WHERE b.modelo = :modelo")
    , @NamedQuery(name = "Bus.findByColor", query = "SELECT b FROM Bus b WHERE b.color = :color")
    , @NamedQuery(name = "Bus.findByAnio", query = "SELECT b FROM Bus b WHERE b.anio = :anio")
    , @NamedQuery(name = "Bus.findByKilometraje", query = "SELECT b FROM Bus b WHERE b.kilometraje = :kilometraje")
    , @NamedQuery(name = "Bus.findByNumeroAsiento", query = "SELECT b FROM Bus b WHERE b.numeroAsiento = :numeroAsiento")
    , @NamedQuery(name = "Bus.findByMarca", query = "SELECT b FROM Bus b WHERE b.marca = :marca")
    , @NamedQuery(name = "Bus.findByMotor", query = "SELECT b FROM Bus b WHERE b.motor = :motor")})
public class Bus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBus")
    private Integer idBus;
    @Size(max = 50)
    @Column(name = "numerochasis")
    private String numerochasis;
    @Size(max = 10)
    @Column(name = "placa")
    private String placa;
    @Size(max = 20)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 10)
    @Column(name = "color")
    private String color;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "kilometraje")
    private Integer kilometraje;
    @Column(name = "numeroAsiento")
    private Integer numeroAsiento;
    @Size(max = 50)
    @Column(name = "marca")
    private String marca;
    @Column(name = "motor")
    private Integer motor;
    @OneToMany(mappedBy = "idBus")
    private List<Horario> horarioList;
    @OneToMany(mappedBy = "idBus")
    private List<Conductor> conductorList;

    public Bus() {
    }

    public Bus(Integer idBus) {
        this.idBus = idBus;
    }

    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
    }

    public String getNumerochasis() {
        return numerochasis;
    }

    public void setNumerochasis(String numerochasis) {
        this.numerochasis = numerochasis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Integer getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(Integer numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getMotor() {
        return motor;
    }

    public void setMotor(Integer motor) {
        this.motor = motor;
    }

    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    public List<Conductor> getConductorList() {
        return conductorList;
    }

    public void setConductorList(List<Conductor> conductorList) {
        this.conductorList = conductorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBus != null ? idBus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.idBus == null && other.idBus != null) || (this.idBus != null && !this.idBus.equals(other.idBus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Bus[ idBus=" + idBus + " ]";
    }

}
