
package domain;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity()
@Table(name = "PessoasPapeis")
public abstract class AbstractPessoaPapel {
    @Id()
    @GeneratedValue()
    private Integer id;
    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "AbstractPessoaPapel{" +
                "id=" + id +
                ", pessoa=" + pessoa.getId() +
                '}';
    }
}
