/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Secao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class SecaoBean implements SecaoBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(Secao secao) {
        em.persist(secao);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Secao consultar(Long id) {
        return (em.find(Secao.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        Secao s = em.find(Secao.class, id);
        em.remove(s);
    }

    @Override
    public void alterar(Long id, Secao secao) {
        Secao s = em.find(Secao.class, id);

    s.setNome(secao.getNome());
    
    }
}