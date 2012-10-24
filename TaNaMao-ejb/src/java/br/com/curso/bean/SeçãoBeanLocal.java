/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Seção;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface SeçãoBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(Seção seção);

    public Seção consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, Seção seção);
    
}
