package pe.edu.i202220503.model.pk;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
