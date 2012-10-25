/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.ClasseProduto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class ClasseProdutoBean implements ClasseProdutoBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(ClasseProduto classeproduto) {
        em.persist(classeproduto);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public ClasseProduto consultar(Long id) {
        return (em.find(ClasseProduto.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        ClasseProduto c = em.find(ClasseProduto.class, id);
        em.remove(c);
    }

    @Override
    public void alterar(Long id, ClasseProduto classeproduto) {
        ClasseProduto c = em.find(ClasseProduto.class, id);

        c.setNome(classeproduto.getNome());
        c.setSecao(classeproduto.getSecao());
        c.setDescricao(classeproduto.getDescricao());
        c.setNoAnterior(classeproduto.getNoAnterior());
        c.setOrdem(classeproduto.getOrdem());

    }
}