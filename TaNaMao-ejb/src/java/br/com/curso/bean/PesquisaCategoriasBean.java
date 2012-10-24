/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.bean;

import br.com.curso.entidade.PesquisaCategorias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateless
public class PesquisaCategoriasBean implements PesquisaCategoriasBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PersistenceContext(unitName = "TaNaMao-ejbPU")
    private EntityManager em;

    @Override
    public void incluir(PesquisaCategorias pesquisacategorias) {
        em.persist(pesquisacategorias);
    }
    
    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public PesquisaCategorias consultar(Long id) {
        return (em.find(PesquisaCategorias.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        PesquisaCategorias p = em.find(PesquisaCategorias.class, id);
        em.remove(p);
    }

    @Override
    public void alterar(Long id, PesquisaCategorias pesquisacategorias) {
        PesquisaCategorias p = em.find(PesquisaCategorias.class, id);

	p.setXe(pesquisacategorias.getXe());
	p.setXg(pesquisacategorias.getXg());
	p.setXt(pesquisacategorias.getXt());
	p.setXj(pesquisacategorias.getXj());
	p.setXk(pesquisacategorias.getXk());
	p.setNome(pesquisacategorias.getNome());
	p.setDescricao(pesquisacategorias.getDescricao());
	p.setSeção(pesquisacategorias.getSeção());
	p.setFabricante(pesquisacategorias.getFabricante());

    }
}