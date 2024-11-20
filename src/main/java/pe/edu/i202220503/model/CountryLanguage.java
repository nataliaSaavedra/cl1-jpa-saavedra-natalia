package pe.edu.i202220503.model;

import jakarta.persistence.*;
import pe.edu.i202220503.model.pk.CountryLanguageId;

@Entity
@Table(name = "countryLanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @JoinColumn(name = "CountryCode", updatable = false, insertable = false)
    private Country country;
    @Column(name = "IsOfficial")
    private String isOfficial;
    @Column(name = "Percentage")
    private Double percentage;

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getOfficial() {
        return isOfficial;
    }

    public void setOfficial(String official) {
        isOfficial = official;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }
}
