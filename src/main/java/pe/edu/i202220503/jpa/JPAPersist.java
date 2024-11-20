package pe.edu.i202220503.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202220503.model.City;
import pe.edu.i202220503.model.Country;
import pe.edu.i202220503.model.CountryLanguage;
import pe.edu.i202220503.model.pk.CountryLanguageId;

public class JPAPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_NATALIA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Country country = new Country();
        country.setCode("XYZ");
        country.setName("CountryXYZ");
        country.setContinent("North America");
        country.setRegion("RegionXYZ");
        country.setSurfaceArea(12345.67);
        country.setIndepYear(2024);
        country.setPopulation(1000);
        country.setLifeExpectancy(70.5);
        country.setGnp(12345.67);
        country.setGnpOld(123456.78);
        country.setLocalName("LocalXYZ");
        country.setGovernmentForm("Republic");
        country.setHeadOfState("LeaderXYZ");
        country.setCapital(null);
        country.setCode2("XY");

        em.persist(country);

        City cityX = new City();
        cityX.setName("City X");
        cityX.setDistrict("District X");
        cityX.setPopulation(500);
        cityX.setCountry(country);

        City cityZ = new City();
        cityZ.setName("City Z");
        cityZ.setDistrict("District Z");
        cityZ.setPopulation(300);
        cityZ.setCountry(country);

        City cityY = new City();
        cityY.setName("City Y");
        cityY.setDistrict("District Y");
        cityY.setPopulation(200);
        cityY.setCountry(country);

        em.persist(cityX);
        em.persist(cityY);
        em.persist(cityZ);

        CountryLanguage language1 = new CountryLanguage();
        CountryLanguageId id1 = new CountryLanguageId();
        id1.setCountryCode(country.getCode());
        id1.setLanguage("German");
        language1.setId(id1);
        language1.setOfficial("T");
        language1.setPercentage(75.0);

        CountryLanguage language2 = new CountryLanguage();
        CountryLanguageId id2 = new CountryLanguageId();
        id2.setCountryCode(country.getCode());
        id2.setLanguage("Japanese");
        language2.setId(id2);
        language2.setOfficial("T");
        language2.setPercentage(25.0);

        em.persist(language1);
        em.persist(language2);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
