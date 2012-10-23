/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Vendedor;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface VendedorBeanLocal {

    void incluir(Vendedor vendedor);

    public void persist(java.lang.Object object);
    
}
