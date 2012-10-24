/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Historico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class HistoricoBean implements HistoricoBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(Historico historico) {
        em.persist(historico);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Historico consultar(Long id) {
        return (em.find(Historico.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        Historico h = em.find(Historico.class, id);
        em.remove(h);
    }

    @Override
    public void alterar(Long id, Historico historico) {
        Historico h = em.find(Historico.class, id);

    h.setItem(historico.getItem());
    h.setPreco(historico.getPreco());
    h.setDataPreco(historico.getDataPreco());
    h.setItemDeLoja(historico.getItemDeLoja());

    }
}