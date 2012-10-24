/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Seção;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class SeçãoBean implements SeçãoBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(Seção seção) {
        em.persist(seção);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Seção consultar(Long id) {
        return (em.find(Seção.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        Seção s = em.find(Seção.class, id);
        em.remove(s);
    }

    @Override
    public void alterar(Long id, Seção seção) {
        Seção s = em.find(Seção.class, id);

    s.setNome(seção.getNome());

    }
}