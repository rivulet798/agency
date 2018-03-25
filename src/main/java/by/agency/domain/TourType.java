package by.agency.domain;

/**
 * The TourType is enum class used for storage
 * type of tour.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public enum TourType {
    TRIP("Trip"),
    VACATION("Vacation"),
    SHOPPING("Shopping");

    private String name;

    TourType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}