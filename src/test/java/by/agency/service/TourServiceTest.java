package by.agency.service;
import by.agency.domain.Tour;
import by.agency.domain.TourType;
import by.agency.service.impl.TourServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TourServiceTest {
    private TourServiceImpl tourService;

    private Tour tour;

    @Before
    public void init(){
        tourService = mock(TourServiceImpl.class);
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
        when(tourService.add(tour)).thenReturn(null);
        tourService.add(tour);
        verify(tourService).add(tour);
    }

    @Test
    public void readTest() {
        when(tourService.getEntityById(tour.getId())).thenReturn(tour);
        tourService.getEntityById(tour.getId());
        verify(tourService).getEntityById(tour.getId());
    }

    @Test
    public void readAllTest() {
        tourService.getAll();
        verify(tourService).getAll();
    }

    @Test
    public void deleteTest() {
        when(tourService.removeById(tour.getId())).thenReturn(tour);
        tourService.removeById(tour.getId());
        verify(tourService).removeById(tour.getId());
    }
}
