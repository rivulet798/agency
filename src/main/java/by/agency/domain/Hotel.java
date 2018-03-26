package by.agency.domain;

import java.util.Objects;
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
        return stars == hotel.stars &&
                Objects.equals(name, hotel.name) &&
                Objects.equals(phone, hotel.phone) &&
                Objects.equals(country, hotel.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, phone, country, stars);
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
