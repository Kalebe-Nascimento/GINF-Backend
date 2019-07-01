/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByDsSenha", query = "SELECT u FROM Usuario u WHERE u.dsSenha = :dsSenha")
    , @NamedQuery(name = "Usuario.findByDsEmail", query = "SELECT u FROM Usuario u WHERE u.dsEmail = :dsEmail")
    , @NamedQuery(name = "Usuario.findByNmNomeReal", query = "SELECT u FROM Usuario u WHERE u.nmNomeReal = :nmNomeReal")
    , @NamedQuery(name = "Usuario.findByNmnicknameUser", query = "SELECT u FROM Usuario u WHERE u.nmnicknameUser = :nmnicknameUser")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 30)
    @Column(name = "ds_senha")
    private String dsSenha;
    @Size(max = 2147483647)
    @Column(name = "ds_email")
    private String dsEmail;
    @Size(max = 50)
    @Column(name = "nm_nome_real")
    private String nmNomeReal;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nm_nicknameUser")
    private String nmnicknameUser;

    public Usuario() {
    }

    public Usuario(String nmnicknameUser) {
        this.nmnicknameUser = nmnicknameUser;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getNmNomeReal() {
        return nmNomeReal;
    }

    public void setNmNomeReal(String nmNomeReal) {
        this.nmNomeReal = nmNomeReal;
    }

    public String getNmnicknameUser() {
        return nmnicknameUser;
    }

    public void setNmnicknameUser(String nmnicknameUser) {
        this.nmnicknameUser = nmnicknameUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmnicknameUser != null ? nmnicknameUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.nmnicknameUser == null && other.nmnicknameUser != null) || (this.nmnicknameUser != null && !this.nmnicknameUser.equals(other.nmnicknameUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classe.Usuario[ nmnicknameUser=" + nmnicknameUser + " ]";
    }
    
}
