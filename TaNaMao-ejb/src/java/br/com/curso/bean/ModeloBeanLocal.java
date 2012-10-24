/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Modelo;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface ModeloBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(Modelo modelo);

    public Modelo consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, Modelo modelo);
    
}
