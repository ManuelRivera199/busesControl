
package com.empresa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "horario")
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h")
    , @NamedQuery(name = "Horario.findByIdHorario", query = "SELECT h FROM Horario h WHERE h.idHorario = :idHorario")
    , @NamedQuery(name = "Horario.findByHorafechasalida", query = "SELECT h FROM Horario h WHERE h.horafechasalida = :horafechasalida")
    , @NamedQuery(name = "Horario.findByHorafechaentrada", query = "SELECT h FROM Horario h WHERE h.horafechaentrada = :horafechaentrada")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHorario")
    private Integer idHorario;
    @Column(name = "horafechasalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafechasalida;
    @Column(name = "horafechaentrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafechaentrada;
    @JoinColumn(name = "idBus", referencedColumnName = "idBus")
    @ManyToOne
    private Bus idBus;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Date getHorafechasalida() {
        return horafechasalida;
    }

    public void setHorafechasalida(Date horafechasalida) {
        this.horafechasalida = horafechasalida;
    }

    public Date getHorafechaentrada() {
        return horafechaentrada;
    }

    public void setHorafechaentrada(Date horafechaentrada) {
        this.horafechaentrada = horafechaentrada;
    }

    public Bus getIdBus() {
        return idBus;
    }

    public void setIdBus(Bus idBus) {
        this.idBus = idBus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Horario[ idHorario=" + idHorario + " ]";
    }
    
}
