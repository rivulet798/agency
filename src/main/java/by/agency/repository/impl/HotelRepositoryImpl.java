package by.agency.repository.impl;

import by.agency.domain.Hotel;
import by.agency.repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The HotelRepositoryImpl class implements and realizes
 * methods of IRepository interface.
 *
 * Description of methods:
 * @see IRepository
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class HotelRepositoryImpl implements IRepository<Hotel> {
    private Map<Integer, Hotel> map;

    public HotelRepositoryImpl() {
        map = new HashMap<>();
    }

    @Override
    public List<Hotel> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Hotel getEntityById(int id)  {
        return map.get(id);
    }

    @Override
    public Hotel add(Hotel hotel) {
        return map.put(hotel.getId(), hotel);
    }

    @Override
    public Hotel removeById(int id) {
        return map.remove(id);
    }
}

