package ro.itschool.project.unit_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ro.itschool.project.models.dtos.UserDTO;
import ro.itschool.project.models.entities.User;
import ro.itschool.project.repositories.UserRepository;
import ro.itschool.project.services.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void testCreateUser() {
        //GIVEN
        User user = new User();
        user.setFirstName("Maria");
        user.setLastName("Popescu");
        user.setEmail("maria@email.com");

        User savedUser = new User();
        savedUser.setId(1L);
        savedUser.setFirstName("Maria");
        savedUser.setLastName("Popescu");
        savedUser.setEmail("maria@email.com");

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setFirstName("Maria");
        userDTO.setLastName("Popescu");
        userDTO.setEmail("maria@email.com");

        when(userRepository.save(user)).thenReturn(savedUser);

        //WHEN
        UserDTO savedUserDto = userService.createUser(userDTO);

        //THEN
        verify(userRepository, times(1)).save(user);
        assertEquals(userDTO, savedUserDto);
    }
}