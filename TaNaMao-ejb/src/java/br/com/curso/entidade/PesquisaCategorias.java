/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.entidade;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Bruno
 */
@Entity
public class PesquisaCategorias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int xe;
	private int xg;
	private int xt;
	private int xj;
	private int xk;
	private int nome;
	private int descricao;
    @ManyToOne
	private Seção seção;	 
    @ManyToOne
	private Fabricante fabricantes;

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
        if (!(object instanceof PesquisaCategorias)) {
            return false;
        }
        PesquisaCategorias other = (PesquisaCategorias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.curso.entidade.PesquisaCategorias[ id=" + id + " ]";
    }
    
}
