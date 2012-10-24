/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.Modelo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class ModeloBean implements ModeloBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(Modelo modelo) {
        em.persist(modelo);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Modelo consultar(Long id) {
        return (em.find(Modelo.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        Modelo m = em.find(Modelo.class, id);
        em.remove(m);
    }

    @Override
    public void alterar(Long id, Modelo modelo) {
        Modelo m = em.find(Modelo.class, id);

        m.setModelo(modelo.getModelo());
        m.setFabricante(modelo.getFabricante());
        m.setEspecificacao(modelo.getEspecificacao());
        m.setXe(modelo.getXe());
        m.setXg(modelo.getXg());
        m.setXt(modelo.getXt());
        m.setXj(modelo.getXj());
        m.setXk(modelo.getXk());
        m.setClasseProduto(modelo.getClasseProduto());
        m.setPesquisaCategorias(modelo.getPesquisaCategorias());

    }
}