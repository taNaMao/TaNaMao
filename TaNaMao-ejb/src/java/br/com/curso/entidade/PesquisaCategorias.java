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
	private Secao secao;	 
    @ManyToOne
	private Fabricante fabricante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }

    public int getXe() {
        return xe;
    }

    public void setXe(int xe) {
        this.xe = xe;
    }

    public int getXg() {
        return xg;
    }

    public void setXg(int xg) {
        this.xg = xg;
    }

    public int getXj() {
        return xj;
    }

    public void setXj(int xj) {
        this.xj = xj;
    }

    public int getXk() {
        return xk;
    }

    public void setXk(int xk) {
        this.xk = xk;
    }

    public int getXt() {
        return xt;
    }

    public void setXt(int xt) {
        this.xt = xt;
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
        return "PesquisaCategorias{" + "id=" + id + ", xe=" + xe + ", xg=" + xg + ", xt=" + xt + ", xj=" + xj + ", xk=" + xk + ", nome=" + nome + ", descricao=" + descricao + ", se\u00e7\u00e3o=" + secao + ", fabricante=" + fabricante + '}';
    }


    
}
