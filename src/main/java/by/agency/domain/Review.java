package by.agency.domain;

import java.util.Optional;

/**
 * The Review is entity class used for storage
 * information about review.
 * Review extends of Entity abstract class.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class Review extends Entity {
    private Optional<Tour> tour;
    private Optional<User> user;
    private String content;

    public Optional<Tour> getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = Optional.of(tour);
    }

    public Optional<User> getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = Optional.of(user);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Review review = (Review) o;

        if (tour != null ? !tour.equals(review.tour) : review.tour != null) return false;
        if (user != null ? !user.equals(review.user) : review.user != null) return false;
        return content != null ? content.equals(review.content) : review.content == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (tour != null ? tour.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Review{" +
                "tour=" + tour +
                ", user=" + user +
                ", content='" + content + '\'' +
                '}';
    }
}
