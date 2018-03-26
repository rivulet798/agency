package by.agency.domain;

import java.util.List;
import java.util.Objects;

/**
 * The User is entity class used for storage
 * information about user.
 * User extends of Entity abstract class.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class User extends Entity{
    private String login;
    private String password;
    private List<Tour> tours;
    private List<Review> reviews;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(tours, user.tours) &&
                Objects.equals(reviews, user.reviews);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), login, password, tours, reviews);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", tours=" + tours +
                ", reviews=" + reviews +
                '}';
    }
}
