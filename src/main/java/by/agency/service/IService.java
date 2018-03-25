package by.agency.service;

import by.agency.domain.Entity;

import java.util.List;

/**
 * The IService is the interface
 * which contains CRUD methods.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public interface IService<T extends Entity> {
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

