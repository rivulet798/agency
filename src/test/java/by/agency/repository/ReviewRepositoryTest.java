package by.agency.repository;

import by.agency.domain.*;
import by.agency.repository.impl.ReviewRepositoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Map;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ReviewRepositoryTest {
    @InjectMocks
    private ReviewRepositoryImpl reviewRepository;

    @Mock
    private Map<Integer, Review> reviewMap;

    private Review review;

    @Before
    public void init(){
        review = new Review();
        review.setId(1);
        review.setContent("5*");
    }

    @After
    public void remove() {
        review = null;
    }

    @Test
    public void save() {
        when(reviewMap.put(review.getId(), review)).thenReturn(null);
        reviewRepository.add(review);
        verify(reviewMap).put(review.getId(), review);
    }

    @Test
    public void readAllTest() {
        reviewRepository.getAll();
        verify(reviewMap).values();
    }

    @Test
    public void readTest() {
        when(reviewMap.get(review.getId())).thenReturn(review);
        reviewRepository.getEntityById(review.getId());
        verify(reviewMap).get(review.getId());
    }

    @Test
    public void deleteTest() {
        when(reviewMap.remove(review.getId())).thenReturn(review);
        reviewRepository.removeById(review.getId());
        verify(reviewMap).remove(review.getId());
    }
}
