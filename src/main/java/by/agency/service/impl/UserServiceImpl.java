package by.agency.service.impl;

import by.agency.domain.User;
import by.agency.repository.IRepository;
import by.agency.repository.factory.RepositoryFactory;
import by.agency.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The UserServiceImpl class implements and realizes
 * methods of IService interface.
 *
 * Description of methods:
 * @see IService
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class UserServiceImpl implements IService<User> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private IRepository<User> userRepository = RepositoryFactory.getInstance().getUserRepository();

    @Override
    public List<User> getAll() {
        LOGGER.info("Get all users");
        return userRepository.getAll();
    }

    @Override
    public User getEntityById(int id) {
        LOGGER.info("Get user");
        return userRepository.getEntityById(id);
    }

    @Override
    public User add(User user) {
        LOGGER.info("Add user");
        return userRepository.add(user);
    }

    @Override
    public User removeById(int id) {
        LOGGER.info("Delete user");
        return userRepository.removeById(id);
    }
}

