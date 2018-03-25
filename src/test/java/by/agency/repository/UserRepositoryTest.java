package by.agency.repository;

import by.agency.domain.User;
import by.agency.repository.impl.UserRepositoryImpl;
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
public class UserRepositoryTest {
    @InjectMocks
    private UserRepositoryImpl userRepository;

    @Mock
    private Map<Integer, User> userMap;

    private User user;

    @Before
    public void init(){
        user = new User();
        user.setId(1);
        user.setLogin("katya");
        user.setPassword("222");
    }

    @After
    public void remove() {
        user = null;
    }

    @Test
    public void save() {
        when(userMap.put(user.getId(), user)).thenReturn(null);
        userRepository.add(user);
        verify(userMap).put(user.getId(), user);
    }

    @Test
    public void readAllTest() {
        userRepository.getAll();
        verify(userMap).values();
    }

    @Test
    public void readTest() {
        when(userMap.get(user.getId())).thenReturn(user);
        userRepository.getEntityById(user.getId());
        verify(userMap).get(user.getId());
    }

    @Test
    public void deleteTest() {
        when(userMap.remove(user.getId())).thenReturn(user);
        userRepository.removeById(user.getId());
        verify(userMap).remove(user.getId());
    }
}
