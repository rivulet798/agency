package by.agency.service.impl;

import by.agency.domain.Tour;
import by.agency.repository.IRepository;
import by.agency.repository.factory.RepositoryFactory;
import by.agency.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The TourServiceImpl class implements and realizes
 * methods of IService interface.
 *
 * Description of methods:
 * @see IService
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class TourServiceImpl implements IService<Tour> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TourServiceImpl.class);
    private IRepository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();

    @Override
    public List<Tour> getAll() {
        LOGGER.info("Get all tours");
        return tourRepository.getAll();
    }

    @Override
    public Tour getEntityById(int id) {
        LOGGER.info("Get tour");
        return tourRepository.getEntityById(id);
    }

    @Override
    public Tour add(Tour tour) {
        LOGGER.info("Add tour");
        return tourRepository.add(tour);
    }

    @Override
    public Tour removeById(int id) {
        LOGGER.info("Delete tour");
        return tourRepository.removeById(id);
    }
}

