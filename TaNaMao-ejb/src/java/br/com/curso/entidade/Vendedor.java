/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Bruno
 */
@Entity
public class Vendedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String cnpj;
	private String email;
	private String login;
	private String senha;
	private String endereço;
    @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataInicio;
	private char regiao;
	private boolean praFora;
	private boolean podeParcelar;
	private String tel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isPodeParcelar() {
        return podeParcelar;
    }

    public void setPodeParcelar(boolean podeParcelar) {
        this.podeParcelar = podeParcelar;
    }

    public boolean isPraFora() {
        return praFora;
    }

    public void setPraFora(boolean praFora) {
        this.praFora = praFora;
    }

    public char getRegiao() {
        return regiao;
    }

    public void setRegiao(char regiao) {
        this.regiao = regiao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedor)) {
            return false;
        }
        Vendedor other = (Vendedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", cnpj=" + cnpj + ", email=" + email + ", login=" + login + ", senha=" + senha + ", endere\u00e7o=" + endereço + ", dataInicio=" + dataInicio + ", regiao=" + regiao + ", praFora=" + praFora + ", podeParcelar=" + podeParcelar + ", tel=" + tel + '}';
    }
    
}
