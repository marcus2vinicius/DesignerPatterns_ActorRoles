package test;

import domain.Pessoa;
import domain.Presidente;
import domain.Professor;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;

/**
 * Created by Marcus on 22/02/2016.
 */
public class Test {
    static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("Local");
        criaTodosEMostra();
    }



    private static void criaTodosEMostra(){
        criaPessoa();
        criaPresidente();
        criaProfessor();
        EntityManager em = emf.createEntityManager();
        em.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList().forEach(System.out::println);
        em.createQuery("SELECT p FROM Presidente p", Presidente.class).getResultList().forEach(System.out::println);
        em.createQuery("select p from Professor p",Professor.class).getResultList().forEach(System.out::println);
        em.close();
    }

    private static void criaProfessor() {
        Professor professor = new Professor();
        professor.setCodigoDeProfessor("PRO12321");
        EntityManager em = emf.createEntityManager();
        Pessoa p = (Pessoa) em.createQuery("select p from Pessoa p").getResultList().get(0);
        professor.setPessoa(p);
        em.getTransaction().begin();
        em.persist(professor);
        em.getTransaction().commit();
    }

    private static void criaPresidente() {
        Presidente presidente = new Presidente();
        presidente.setCodigoPresidente("PRES1231");
        EntityManager em = emf.createEntityManager();
        Pessoa p = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList().get(0);
        presidente.setPessoa(p);
        em.getTransaction().begin();
        em.persist(presidente);
        em.getTransaction().commit();
    }

    private static void criaPessoa() {
        Pessoa p = new Pessoa();
        p.setNome("Marcus Vinicius");
        p.setCpf("42342342342");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }


    public String getPath(){
        return getClass().getClassLoader().getResource("").getPath();
    }

}
