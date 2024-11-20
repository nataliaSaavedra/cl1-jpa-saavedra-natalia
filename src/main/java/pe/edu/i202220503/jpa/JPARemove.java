package pe.edu.i202220503.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202220503.model.Country;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_NATALIA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        String countryCode= "XYZ";
        Country country = em.find(Country.class, countryCode);

        em.remove(country);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
