/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.ClasseProduto;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface ClasseProdutoBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(ClasseProduto classeproduto);

    public ClasseProduto consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, ClasseProduto classeproduto);
    
}
