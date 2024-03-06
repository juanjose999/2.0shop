package com.tienda.controller;

import com.tienda.controller.user.UserController;
import com.tienda.model.dto.user.UserDto;
import com.tienda.model.dto.user.UserMapper;
import com.tienda.model.dto.user.UserResponseDto;
import com.tienda.model.user.User;
import com.tienda.service.user.UserService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.util.Optional;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.springframework.http.RequestEntity.put;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    /*

    final String BASE_URL = "/v1/user";

    @MockBean
    private UserService userService;

    @Autowired
    private UserController userController;

    private MockMvc mockMvc;

    @BeforeEach
    public void testFindUserById(){
        mockMvc = standaloneSetup(userController).build();
    }

    @Test
    void getAllUser() throws Exception {
        List<UserResponseDto> listaUsers = new ArrayList<>();
        listaUsers.add(new UserResponseDto("1", "Juan", "Sierra", "juan@gmail.com", "xjuanx"));
        listaUsers.add(new UserResponseDto("2", "Maria", "ordaz", "marih@gmail.com", "marizz"));

        when(userService.getAllUsers()).thenReturn(listaUsers);

        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk());
        Assertions.assertEquals(HttpStatus.OK.value(), mockMvc.perform(get(BASE_URL)).andReturn().getResponse().getStatus());
    }

    @Test
    void findUserById() throws Exception {
        UserResponseDto user = new UserResponseDto("1", "Juan", "Sierra", "juan@gmail.com", "xjuanx");
        when(userService.findUserById("1")).thenReturn(Optional.of(user));
        mockMvc.perform(get(BASE_URL + "/1"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Matchers.is("1")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Juan")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName", Matchers.is("Sierra")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", Matchers.is("juan@gmail.com")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.password", Matchers.is("xjuanx")));

        Mockito.verify(userService, times(1)).findUserById("1");
    }*/

}