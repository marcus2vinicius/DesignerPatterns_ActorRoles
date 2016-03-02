package domain;

import javax.persistence.Entity;

/**
 * Created by Marcus on 29/02/2016.
 */
@Entity
public class Presidente extends AbstractPessoaPapel {
    private String codigoPresidente;

    public String getCodigoPresidente() {
        return codigoPresidente;
    }

    public void setCodigoPresidente(String codigoPresidente) {
        this.codigoPresidente = codigoPresidente;
    }

    @Override
    public String toString() {
        return "Presidente{" +
                "codigoPresidente='" + codigoPresidente + '\'' +
                '}'+super.toString();
    }
}
