package by.agency.repository;

import by.agency.domain.Entity;

import java.util.*;

/**
 * The IRepository is the interface
 * which contains CRUD methods.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public interface IRepository<T extends Entity> {
    /**
     *
     * @return list of Entities
     */
    List<T> getAll();

    /**
     *
     * @param id of Entity
     * @return object of Entity
     */
    T getEntityById(int id);

    /**
     *
     * @param temp - object of entity
     * @return object of Entity
     */
    T add(T temp);

    /**
     *
     * @param id of Entity
     * @return object of Entity
     */
    T removeById(int id);
}
