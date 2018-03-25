package by.agency.service.impl;

import by.agency.domain.Country;
import by.agency.repository.IRepository;
import by.agency.repository.factory.RepositoryFactory;
import by.agency.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The CountryServiceImpl class implements and realizes
 * methods of IService interface.
 *
 * Description of methods:
 * @see IService
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class CountryServiceImpl implements IService<Country> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryServiceImpl.class);
    private IRepository<Country> countryRepository = RepositoryFactory.getInstance().getCountryRepository();

    @Override
    public List<Country> getAll() {
        LOGGER.info("Get all countries");
        return countryRepository.getAll();
    }

    @Override
    public Country getEntityById(int id) {
        LOGGER.info("Get country");
        return countryRepository.getEntityById(id);
    }

    @Override
    public Country add(Country country) {
        LOGGER.info("Add country");
        return countryRepository.add(country);
    }

    @Override
    public Country removeById(int id) {
        LOGGER.info("Delete country");
        return countryRepository.removeById(id);
    }
}

