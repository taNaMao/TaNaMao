/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.ItemDeLoja;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class ItemDeLojaBean implements ItemDeLojaBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(ItemDeLoja itemdeloja) {
        em.persist(itemdeloja);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public ItemDeLoja consultar(Long id) {
        return (em.find(ItemDeLoja.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        ItemDeLoja i = em.find(ItemDeLoja.class, id);
        em.remove(i);
    }

    @Override
    public void alterar(Long id, ItemDeLoja itemdeloja) {
        ItemDeLoja i = em.find(ItemDeLoja.class, id);

        i.setModelo(itemdeloja.getModelo());
        i.setHistorico(itemdeloja.getHistorico());


    }
}