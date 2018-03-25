package by.agency.repository;

import by.agency.domain.Tour;
import by.agency.domain.TourType;
import by.agency.repository.impl.TourRepositoryImpl;
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
public class TourRepositoryTest {
    @InjectMocks
    private TourRepositoryImpl tourRepository;

    @Mock
    private Map<Integer, Tour> tourMap;

    private Tour tour;

    @Before
    public void init(){
        tour = new Tour();
        tour.setId(1);
        tour.setType(TourType.TRIP);
        tour.setCost(145.0);
    }

    @After
    public void remove() {
        tour = null;
    }

    @Test
    public void save() {
        when(tourMap.put(tour.getId(), tour)).thenReturn(null);
        tourRepository.add(tour);
        verify(tourMap).put(tour.getId(), tour);
    }

    @Test
    public void readAllTest() {
        tourRepository.getAll();
        verify(tourMap).values();
    }

    @Test
    public void readTest() {
        when(tourMap.get(tour.getId())).thenReturn(tour);
        tourRepository.getEntityById(tour.getId());
        verify(tourMap).get(tour.getId());
    }

    @Test
    public void deleteTest() {
        when(tourMap.remove(tour.getId())).thenReturn(tour);
        tourRepository.removeById(tour.getId());
        verify(tourMap).remove(tour.getId());
    }
}
