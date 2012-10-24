/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Fabricante;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface FabricanteBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(Fabricante fabricante);

    public Fabricante consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, Fabricante fabricante);
    
}
