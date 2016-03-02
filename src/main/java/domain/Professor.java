package domain;

import javax.persistence.Entity;

/**
 * Created by Marcus on 29/02/2016.
 */
@Entity
public class Professor extends AbstractPessoaPapel {
    private String codigoDeProfessor;

    public String getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setCodigoDeProfessor(String codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "codigoDeProfessor='" + codigoDeProfessor + '\'' +
                '}'+super.toString();
    }
}
