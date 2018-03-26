package by.agency.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

/**
 * The Tour is entity class used for storage
 * information about tour.
 * Tour extends of Entity abstract class.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class Tour extends Entity {
    private String photo;
    private LocalDate date;
    private int duration;
    private Optional<Hotel> hotel;
    private TourType type;
    private String description;
    private Double cost;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Optional<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = Optional.of(hotel);
    }

    public TourType getType() {
        return type;
    }

    public void setType(TourType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tour tour = (Tour) o;
        return duration == tour.duration &&
                Objects.equals(photo, tour.photo) &&
                Objects.equals(date, tour.date) &&
                Objects.equals(hotel, tour.hotel) &&
                type == tour.type &&
                Objects.equals(description, tour.description) &&
                Objects.equals(cost, tour.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), photo, date, duration, hotel, type, description, cost);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "photo='" + photo + '\'' +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", hotel=" + hotel +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
