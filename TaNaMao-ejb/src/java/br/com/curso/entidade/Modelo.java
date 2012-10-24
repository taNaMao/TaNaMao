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

    public ClasseProduto getClasseProduto() {
        return classeProduto;
    }

    public void setClasseProduto(ClasseProduto classeProduto) {
        this.classeProduto = classeProduto;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public PesquisaCategorias getPesquisaCategorias() {
        return pesquisaCategorias;
    }

    public void setPesquisaCategorias(PesquisaCategorias pesquisaCategorias) {
        this.pesquisaCategorias = pesquisaCategorias;
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
        return "Modelo{" + "id=" + id + ", modelo=" + modelo + ", fabricante=" + fabricante + ", especificacao=" + especificacao + ", xe=" + xe + ", xg=" + xg + ", xt=" + xt + ", xj=" + xj + ", xk=" + xk + ", classeProduto=" + classeProduto + ", pesquisaCategorias=" + pesquisaCategorias + '}';
    }

    
}
