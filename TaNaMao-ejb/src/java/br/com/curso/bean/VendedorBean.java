/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Vendedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class VendedorBean implements VendedorBeanLocal {
    
    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void incluir(Vendedor vendedor) {
        em.persist(vendedor);
    }

    @Override
    public void persist(Object object) {
        em.persist(object);
    }
    
}
