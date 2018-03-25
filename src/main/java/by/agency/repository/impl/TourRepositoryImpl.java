package by.agency.repository.impl;

import by.agency.domain.Tour;
import by.agency.repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The TourRepositoryImpl class implements and realizes
 * methods of IRepository interface.
 *
 * Description of methods:
 * @see IRepository
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class TourRepositoryImpl implements IRepository<Tour> {
    private Map<Integer, Tour> map;

    public TourRepositoryImpl() {
        map = new HashMap<>();
    }

    @Override
    public List<Tour> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Tour getEntityById(int id)  {
        return map.get(id);
    }

    @Override
    public Tour add(Tour tour) {
        return map.put(tour.getId(), tour);
    }

    @Override
    public Tour removeById(int id) {
        return map.remove(id);
    }
}

