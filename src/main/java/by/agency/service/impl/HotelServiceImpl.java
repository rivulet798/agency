package by.agency.service.impl;

import by.agency.domain.Hotel;
import by.agency.repository.IRepository;
import by.agency.repository.factory.RepositoryFactory;
import by.agency.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The HotelServiceImpl class implements and realizes
 * methods of IService interface.
 *
 * Description of methods:
 * @see IService
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class HotelServiceImpl implements IService<Hotel> {
    private static final Logger LOGGER = LoggerFactory.getLogger(HotelServiceImpl.class);
    private IRepository<Hotel> hotelRepository = RepositoryFactory.getInstance().getHotelRepository();

    @Override
    public List<Hotel> getAll() {
        LOGGER.info("Get all hotels");
        return hotelRepository.getAll();
    }

    @Override
    public Hotel getEntityById(int id) {
        LOGGER.info("Get hotel");
        return hotelRepository.getEntityById(id);
    }

    @Override
    public Hotel add(Hotel hotel) {
        LOGGER.info("Add hotel");
        return hotelRepository.add(hotel);
    }

    @Override
    public Hotel removeById(int id) {
        LOGGER.info("Delete hotel");
        return hotelRepository.removeById(id);
    }
}

