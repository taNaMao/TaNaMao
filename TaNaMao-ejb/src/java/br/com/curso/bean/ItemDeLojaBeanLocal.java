/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.ItemDeLoja;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface ItemDeLojaBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(ItemDeLoja itemdeloja);

    public ItemDeLoja consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, ItemDeLoja itemdeloja);
    
}
