/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Bruno
 */
@Entity
public class ClasseProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String nome;
    @ManyToOne
	private Secao secao;
	private String descricao;
	private int noAnterior;
	private int ordem;
    

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(int noAnterior) {
        this.noAnterior = noAnterior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
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
        if (!(object instanceof ClasseProduto)) {
            return false;
        }
        ClasseProduto other = (ClasseProduto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClasseProduto{" + "id=" + id + ", nome=" + nome + ", se\u00e7\u00e3o=" + secao + ", descri\u00e7\u00e3o=" + descricao + ", noAnterior=" + noAnterior + ", ordem=" + ordem + '}';
    }

    
    
}
