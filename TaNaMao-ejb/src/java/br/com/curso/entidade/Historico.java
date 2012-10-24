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

    public Date getDataPreco() {
        return dataPreco;
    }

    public void setDataPreco(Date dataPreco) {
        this.dataPreco = dataPreco;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public ItemDeLoja getItemDeLoja() {
        return itemDeLoja;
    }

    public void setItemDeLoja(ItemDeLoja itemDeLoja) {
        this.itemDeLoja = itemDeLoja;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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
        return "Historico{" + "id=" + id + ", item=" + item + ", preco=" + preco + ", dataPreco=" + dataPreco + ", itemDeLoja=" + itemDeLoja + '}';
    }

    
}
