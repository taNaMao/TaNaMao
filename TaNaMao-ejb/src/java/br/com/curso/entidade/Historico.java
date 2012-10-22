/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Bruno
 */
@Entity
public class Historico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int item;
	private Double preco;
    @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataPreco;
    @ManyToOne
	private ItemDeLoja itemDeLoja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historico)) {
            return false;
        }
        Historico other = (Historico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.curso.entidade.Historico[ id=" + id + " ]";
    }
    
}
