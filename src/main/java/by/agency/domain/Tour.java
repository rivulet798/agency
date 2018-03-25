package by.agency.domain;

import java.time.LocalDate;
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

        if (duration != tour.duration) return false;
        if (!photo.equals(tour.photo)) return false;
        if (!date.equals(tour.date)) return false;
        if (!hotel.equals(tour.hotel)) return false;
        if (!type.equals(tour.type)) return false;
        if (!description.equals(tour.description)) return false;
        return cost.equals(tour.cost);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + duration;
        result = 31 * result + (hotel != null ? hotel.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        return result;
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
