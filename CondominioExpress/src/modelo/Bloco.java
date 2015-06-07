/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fábio
 */
@Entity
@Table(name = "bloco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bloco.findAll", query = "SELECT b FROM Bloco b"),
    @NamedQuery(name = "Bloco.findByIdBloco", query = "SELECT b FROM Bloco b WHERE b.idBloco = :idBloco"),
    @NamedQuery(name = "Bloco.findByNome", query = "SELECT b FROM Bloco b WHERE b.nome = :nome"),
    @NamedQuery(name = "Bloco.findByQtdApartamento", query = "SELECT b FROM Bloco b WHERE b.qtdApartamento = :qtdApartamento")})
public class Bloco implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBloco")
    private Integer idBloco;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "QtdApartamento")
    private Integer qtdApartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "blocoidBloco")
    private Collection<Apartamento> apartamentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "blocoidBloco")
    private Collection<Ocorrencia> ocorrenciaCollection;
    @JoinColumn(name = "Condominio_idCondominio", referencedColumnName = "idCondominio")
    @ManyToOne(optional = false)
    private Condominio condominioidCondominio;

    public Bloco() {
    }

    public Bloco(Integer idBloco) {
        this.idBloco = idBloco;
    }

    public Integer getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(Integer idBloco) {
        Integer oldIdBloco = this.idBloco;
        this.idBloco = idBloco;
        changeSupport.firePropertyChange("idBloco", oldIdBloco, idBloco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Integer getQtdApartamento() {
        return qtdApartamento;
    }

    public void setQtdApartamento(Integer qtdApartamento) {
        Integer oldQtdApartamento = this.qtdApartamento;
        this.qtdApartamento = qtdApartamento;
        changeSupport.firePropertyChange("qtdApartamento", oldQtdApartamento, qtdApartamento);
    }

    @XmlTransient
    public Collection<Apartamento> getApartamentoCollection() {
        return apartamentoCollection;
    }

    public void setApartamentoCollection(Collection<Apartamento> apartamentoCollection) {
        this.apartamentoCollection = apartamentoCollection;
    }

    @XmlTransient
    public Collection<Ocorrencia> getOcorrenciaCollection() {
        return ocorrenciaCollection;
    }

    public void setOcorrenciaCollection(Collection<Ocorrencia> ocorrenciaCollection) {
        this.ocorrenciaCollection = ocorrenciaCollection;
    }

    public Condominio getCondominioidCondominio() {
        return condominioidCondominio;
    }

    public void setCondominioidCondominio(Condominio condominioidCondominio) {
        Condominio oldCondominioidCondominio = this.condominioidCondominio;
        this.condominioidCondominio = condominioidCondominio;
        changeSupport.firePropertyChange("condominioidCondominio", oldCondominioidCondominio, condominioidCondominio);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBloco != null ? idBloco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloco)) {
            return false;
        }
        Bloco other = (Bloco) object;
        if ((this.idBloco == null && other.idBloco != null) || (this.idBloco != null && !this.idBloco.equals(other.idBloco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Bloco[ idBloco=" + idBloco + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
