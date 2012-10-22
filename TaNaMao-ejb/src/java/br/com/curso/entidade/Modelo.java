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
public class Modelo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String modelo;
    @ManyToOne
	private Fabricante fabricante;	 
	private String especificacao;
	private int xe;
	private int xg;
	private int xt;
	private int xj;
	private int xk;
    @ManyToOne
	private ClasseProduto classeProduto;
    @ManyToOne
	private PesquisaCategorias pesquisaCategorias;

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
        if (!(object instanceof Modelo)) {
            return false;
        }
        Modelo other = (Modelo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.curso.entidade.Modelo[ id=" + id + " ]";
    }
    
}
