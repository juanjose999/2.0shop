package com.tienda.service;

import com.tienda.model.dto.user.UserDto;
import com.tienda.model.dto.user.UserResponseDto;
import com.tienda.model.user.User;
import com.tienda.repository.user.UserRepository;
import com.tienda.service.user.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    /*

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllUser_ReturnUserResponseDto(){
        when(userRepository.getAllUsers()).thenReturn(Arrays.asList(
                new User("Juan Jose", "sierra ortega","juan@gmail.com","anjuxxx"),
                new User("Maria", "carrillo","maria@gmail.com","mariaccc")
        ));
        List<UserResponseDto> result = userServiceImpl.getAllUsers();

        assertNotNull(result);
        assertEquals(2, result.size());

        assertEquals("Juan Jose", result.get(0).getName());
        assertEquals("juan@gmail.com", result.get(0).getEmail());

        assertEquals("Maria", result.get(1).getName());
        assertEquals("maria@gmail.com", result.get(1).getEmail());
    }

    @Test
    void findUserById_returnUserResponseDto(){
        String idUser = "23";
        User mokupUser = new User("23","Juan Jose", "sierra ortega","juan@gmail.com","anju00");
        mokupUser.setId(idUser);
        when(userRepository.findUserById(idUser)).thenReturn(mokupUser);
        Optional<UserResponseDto> result = userServiceImpl.findUserById(idUser);

        assertNotNull(result);
        assertEquals(idUser, mokupUser.getId());
    }

    @Test
    void saveUser_ReturnUserResponseDto(){
        LocalDate fecha = LocalDate.of(2024, 2, 22);
        UserDto userDto = new UserDto("Juan Jose", "sierra ortega",fecha,"juan@gmail.com","anju00");
        when(userRepository.saveUser(any())).thenReturn(
                new User("Juan Jose", "sierra ortega","juan@gmail.com","anju00"));
        UserResponseDto result = userServiceImpl.saveUser(userDto);

        assertNotNull(result);
        assertEquals("Juan Jose", result.getName());
        assertEquals("juan@gmail.com", result.getEmail());

    }

    @Test
    void updateUser(){

        String userId = "44";
        LocalDate fecha = LocalDate.of(2024, 2, 22);
        UserDto userDto = new UserDto("Maria", "carrillo",fecha,"maria@gmail.com","mariaccc");
        when(userRepository.updateUser(eq(userId), any())).thenAnswer(invocation -> {
            User updateUser = invocation.getArgument(1);
            assertEquals(userDto.getName(), updateUser.getName());
            return true;
        });

        Boolean r = userServiceImpl.updateUser(userId, userDto);
        assertTrue(r);
    }

    @Test
    void deleteUserById(){
        String idUser = "344";

        when(userRepository.deleteUserById(idUser)).thenReturn(true);
        Boolean result = userServiceImpl.deleteUserById(idUser);
        assertTrue(result);
    }*/

}
