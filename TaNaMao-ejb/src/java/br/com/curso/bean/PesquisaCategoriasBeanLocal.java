/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.PesquisaCategorias;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface PesquisaCategoriasBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(PesquisaCategorias pesquisacategorias);

    public PesquisaCategorias consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, PesquisaCategorias pesquisacategorias);
    
}
