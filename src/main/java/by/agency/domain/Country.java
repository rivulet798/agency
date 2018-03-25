package by.agency.domain;

/**
 * The Country is entity class used for storage
 * information about country.
 * Country extends of Entity abstract class.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class Country extends Entity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Country country = (Country) o;

        return name != null ? name.equals(country.name) : country.name == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
