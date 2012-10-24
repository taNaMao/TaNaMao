/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Fabricante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class FabricanteBean implements FabricanteBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(Fabricante fabricante) {
        em.persist(fabricante);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Fabricante consultar(Long id) {
        return (em.find(Fabricante.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        Fabricante f = em.find(Fabricante.class, id);
        em.remove(f);
    }

    @Override
    public void alterar(Long id, Fabricante fabricante) {
        Fabricante f = em.find(Fabricante.class, id);

    f.setFabricante(fabricante.getFabricante());

    }
}