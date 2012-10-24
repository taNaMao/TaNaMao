/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Historico;
import javax.ejb.Local;

/**
 *
 * @author Bruno
 */
@Local
public interface HistoricoBeanLocal {

    public void persist(java.lang.Object object);

    public void incluir(Historico historico);

    public Historico consultar(Long id);

    public void excluir(Long id);

    public void alterar(Long id, Historico historico);
    
}
