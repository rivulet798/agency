package by.agency.repository.impl;

import by.agency.domain.User;
import by.agency.repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The UserRepositoryImpl class implements and realizes
 * methods of IRepository interface.
 *
 * Description of methods:
 * @see IRepository
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class UserRepositoryImpl implements IRepository<User> {
    private Map<Integer, User> map;

    public UserRepositoryImpl() {
        map = new HashMap<>();
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public User getEntityById(int id)  {
        return map.get(id);
    }

    @Override
    public User add(User user) {
        return map.put(user.getId(), user);
    }

    @Override
    public User removeById(int id) {
        return map.remove(id);
    }
}

