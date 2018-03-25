package by.agency.service;

import by.agency.domain.Country;
import by.agency.service.impl.CountryServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CountryServiceTest {
    private CountryServiceImpl countryIService;

    private Country country;

    @Before
    public void init(){
        countryIService = mock(CountryServiceImpl.class);
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
        when(countryIService.add(country)).thenReturn(null);
        countryIService.add(country);
        verify(countryIService).add(country);
    }

    @Test
    public void readTest() {
        when(countryIService.getEntityById(country.getId())).thenReturn(country);
        countryIService.getEntityById(country.getId());
        verify(countryIService).getEntityById(country.getId());
    }

    @Test
    public void readAllTest() {
        countryIService.getAll();
        verify(countryIService).getAll();
    }

    @Test
    public void deleteTest() {
        when(countryIService.removeById(country.getId())).thenReturn(country);
        countryIService.removeById(country.getId());
        verify(countryIService).removeById(country.getId());
    }
}
