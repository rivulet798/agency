package by.agency.domain;

import java.util.Optional;

/**
 * The Hotel is entity class used for storage
 * information about hotel.
 * Hotel extends of Entity abstract class.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class Hotel extends Entity {
    private String name;
    private String phone;
    private Optional<Country> country;
    private int stars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Optional<Country> getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = Optional.of(country);
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hotel hotel = (Hotel) o;

        if (stars != hotel.stars) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if (phone != null ? !phone.equals(hotel.phone) : hotel.phone != null) return false;
        return country != null ? country.equals(hotel.country) : hotel.country == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + stars;
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", country=" + country +
                ", stars=" + stars +
                '}';
    }
}
