package by.agency.repository;

import by.agency.domain.Country;
import by.agency.repository.impl.CountryRepositoryImpl;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Map;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CountryRepositoryTest {
    @InjectMocks
    private CountryRepositoryImpl countryRepository;

    @Mock
    private Map<Integer, Country> countryHashMap;

    private Country country;

    @Before
    public void init(){
        country = new Country();
        country.setId(1);
        country.setName("Belarus");
    }

    @After
    public void remove() {
        country = null;
    }

    @Test
    public void save() {
        when(countryHashMap.put(country.getId(), country)).thenReturn(null);
        countryRepository.add(country);
        verify(countryHashMap).put(country.getId(), country);
    }

    @Test
    public void readAllTest() {
        countryRepository.getAll();
        verify(countryHashMap).values();
    }

   @Test
    public void readTest() {
       when(countryHashMap.get(country.getId())).thenReturn(country);
       countryRepository.getEntityById(country.getId());
       verify(countryHashMap).get(country.getId());
    }

    @Test
    public void deleteTest() {
        when(countryHashMap.remove(country.getId())).thenReturn(country);
        countryRepository.removeById(country.getId());
        verify(countryHashMap).remove(country.getId());
    }
}
