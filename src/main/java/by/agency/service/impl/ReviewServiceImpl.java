package by.agency.service.impl;

import by.agency.domain.Review;
import by.agency.repository.IRepository;
import by.agency.repository.factory.RepositoryFactory;
import by.agency.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The ReviewServiceImpl class implements and realizes
 * methods of IService interface.
 *
 * Description of methods:
 * @see IService
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public class ReviewServiceImpl implements IService<Review> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReviewServiceImpl.class);
    private IRepository<Review> reviewRepository = RepositoryFactory.getInstance().getReviewRepository();

    @Override
    public List<Review> getAll() {
        LOGGER.info("Get all reviews");
        return reviewRepository.getAll();
    }

    @Override
    public Review getEntityById(int id) {
        LOGGER.info("Get review");
        return reviewRepository.getEntityById(id);
    }

    @Override
    public Review add(Review review) {
        LOGGER.info("Add review");
        return reviewRepository.add(review);
    }

    @Override
    public Review removeById(int id) {
        LOGGER.info("Delete review");
        return reviewRepository.removeById(id);
    }
}

