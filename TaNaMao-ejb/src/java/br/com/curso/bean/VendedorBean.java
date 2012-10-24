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

    @Override
    public Vendedor consultar(Long id) {
        return (em.find(Vendedor.class, id));
    }
    
    @Override
    public void excluir(Long id) {
        Vendedor v = em.find(Vendedor.class, id);
        em.remove(v);
    }

    @Override
    public void alterar(Long id, Vendedor vendedor) {
        Vendedor v = em.find(Vendedor.class, id);
        
        v.setCnpj(vendedor.getCnpj());
        v.setEmail(vendedor.getEmail());
        v.setLogin(vendedor.getLogin());
        v.setSenha(vendedor.getSenha());
        v.setEndereço(vendedor.getEndereço());
        v.setDataInicio(vendedor.getDataInicio());
        v.setRegiao(vendedor.getRegiao());
        v.setPraFora(vendedor.isPraFora());
        v.setPodeParcelar(vendedor.isPodeParcelar());
        v.setTel(vendedor.getTel());
    
    }
    
}
