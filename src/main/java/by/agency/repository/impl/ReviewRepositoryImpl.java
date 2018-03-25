package by.agency.repository.impl;

import by.agency.domain.Review;
import by.agency.repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The ReviewRepositoryImpl class implements and realizes
 * methods of IRepository interface.
 *
 * Description of methods:
 * @see IRepository
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class ReviewRepositoryImpl implements IRepository<Review> {
    private Map<Integer, Review> map;

    public ReviewRepositoryImpl() {
        map = new HashMap<>();
    }

    @Override
    public List<Review> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Review getEntityById(int id)  {
        return map.get(id);
    }

    @Override
    public Review add(Review review) {
        return map.put(review.getId(), review);
    }

    @Override
    public Review removeById(int id) {
        return map.remove(id);
    }
}

