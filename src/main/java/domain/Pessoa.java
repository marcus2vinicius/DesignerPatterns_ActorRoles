package domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Marcus on 29/02/2016.
 */
@Entity
@Table(name = "Pessoas")
public class Pessoa{
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String cpf;
    @OneToMany(mappedBy = "pessoa")
    private Set<AbstractPessoaPapel> papeis;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<AbstractPessoaPapel> getPapeis() {
        return papeis;
    }

    public void setPapeis(Set<AbstractPessoaPapel> papeis) {
        this.papeis = papeis;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
