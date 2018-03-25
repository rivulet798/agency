package by.agency.repository.factory;

import by.agency.repository.IRepository;
import by.agency.domain.*;
import by.agency.repository.impl.*;

/**
 * The RepositoryFactory class uses a FactoryMethod and
 * Singleton pattern to create objects.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class RepositoryFactory {
    /**
     * Field instance realises Singleton pattern
     */
    private static final RepositoryFactory instance = new RepositoryFactory();

    /**
     *
     * @return instance
     */
    public static RepositoryFactory getInstance() {
        return instance;
    }

    /**
     *
     * @return object of CountryRepositoryImpl class
     */
    public IRepository<Country> getCountryRepository() {
        return new CountryRepositoryImpl();
    }

    /**
     *
     * @return object of HotelRepositoryImpl class
     */
    public IRepository<Hotel> getHotelRepository() {
        return new HotelRepositoryImpl();
    }

    /**
     *
     * @return object of ReviewRepositoryImpl class
     */
    public IRepository<Review> getReviewRepository() {
        return new ReviewRepositoryImpl();
    }

    /**
     *
     * @return object of TourRepositoryImpl class
     */
    public IRepository<Tour> getTourRepository() {
        return new TourRepositoryImpl();
    }

    /**
     *
     * @return object of UserRepositoryImpl class
     */
    public IRepository<User> getUserRepository() {
        return new UserRepositoryImpl();
    }
}

