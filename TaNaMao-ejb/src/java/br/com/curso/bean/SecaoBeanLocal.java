/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Secao;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface SecaoBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(Secao secao);

    public Secao consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, Secao secao);
    
}
