package by.agency.repository;

import by.agency.domain.Country;
import by.agency.domain.Hotel;
import by.agency.repository.impl.HotelRepositoryImpl;
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
public class HotelRepositoryTest {
    @InjectMocks
    private HotelRepositoryImpl hotelRepository;

    @Mock
    private Map<Integer, Hotel> hotelMap;

    private Hotel hotel;

    @Before
    public void init(){
        hotel = new Hotel();
        Country country = new Country();
        hotel.setId(1);
        hotel.setName("Minsk");
        hotel.setPhone("+375299699134");
        country.setId(1);
        country.setName("Belarus");
        hotel.setCountry(country);
        hotel.setStars(5);
    }

    @After
    public void remove() {
        hotel = null;
    }

    @Test
    public void save() {
        when(hotelMap.put(hotel.getId(), hotel)).thenReturn(null);
        hotelRepository.add(hotel);
        verify(hotelMap).put(hotel.getId(), hotel);
    }

    @Test
    public void readAllTest() {
        hotelRepository.getAll();
        verify(hotelMap).values();
    }

    @Test
    public void readTest() {
        when(hotelMap.get(hotel.getId())).thenReturn(hotel);
        hotelRepository.getEntityById(hotel.getId());
        verify(hotelMap).get(hotel.getId());
    }

    @Test
    public void deleteTest() {
        when(hotelMap.remove(hotel.getId())).thenReturn(hotel);
        hotelRepository.removeById(hotel.getId());
        verify(hotelMap).remove(hotel.getId());
    }
}
