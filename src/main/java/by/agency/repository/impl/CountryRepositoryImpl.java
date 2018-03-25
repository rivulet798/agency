package by.agency.repository.impl;

import by.agency.domain.Country;
import by.agency.repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The CountryRepositoryImpl class implements and realizes
 * methods of IRepository interface.
 *
 * Description of methods:
 * @see IRepository
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class CountryRepositoryImpl implements IRepository<Country> {
    private Map<Integer, Country> map;

    public CountryRepositoryImpl()
    {
        map = new HashMap<>();
    }

    @Override
    public List<Country> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Country getEntityById(int id) {
        return map.get(id);
    }

    @Override
    public Country add(Country country) {
        return map.put(country.getId(), country);
    }

    @Override
    public Country removeById(int id) {
        return map.remove(id);
    }
}

