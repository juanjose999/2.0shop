package com.tienda.controller;

import com.tienda.controller.product.ProductController;
import com.tienda.model.dto.product.ProductResponseDto;
import com.tienda.service.product.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {
    /*

    final String BASE_URL = "/v1/product";

    @MockBean
    private ProductService productService;

    @Autowired
    private ProductController productController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = standaloneSetup(productController).build();
    }
    @Test
    void getAllProduct() {

        List<ProductResponseDto> listDto = new ArrayList<>();
        listDto.add(new ProductResponseDto("1a","Leche en bolsa","1 litro de lecho entera en bolsa.","Lacteos", "Leche, proteina" , 4500,"http://foto.com"));
        listDto.add(new ProductResponseDto("2a","Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1"));

        when(productService.getAllProduct()).thenReturn(listDto);

        ResponseEntity<List<ProductResponseDto>> result = productController.getAllProduct();

        Assertions.assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    void findProductById() throws Exception {
        ProductResponseDto productResponseDto= new ProductResponseDto("1a","Papas fritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        when(productService.findProductById("1a")).thenReturn(productResponseDto);

        mockMvc.perform(get("/v1/product/{id}", "1a"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idProduct", is("1a")))
                .andExpect(jsonPath("$.nombre", is("Papas fritas")))
                .andExpect(jsonPath("$.descripcion", is("bolsa de papas fritas 30gr")))
                .andExpect(jsonPath("$.categoria", is("Fritos")))
                .andExpect(jsonPath("$.precio", is(2300.0)))
                .andExpect(jsonPath("$.urlFoto", is("URL1")));

        verify(productService, times(1)).findProductById("1a");
    }


    @Test
    void saveProduct() throws Exception {
        ProductResponseDto productResponseDto = new ProductResponseDto("1a","Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        when(productService.saveProduct(any())).thenReturn(productResponseDto);

        String json = "{\"nombre\":\"Papas fritas\",\"descripcion\":\"bolsa de papas fritas\",\"categoria\":\"Fritos\",\"precio\":15.488}";

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(json))
                .andExpect(status().isCreated());

        verify(productService, times(1)).saveProduct(any());
    }

    @Test
    void updateProduct() throws Exception {
        ProductResponseDto productResponseDto = new ProductResponseDto("1a","Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        when(productService.findProductById("1a")).thenReturn(productResponseDto);

        String json = "{\"id\":\"1a\",\"Nombre\":\"Papas fritas\",\"Description\":\"bolsa de papas fritas\",\"category\":\"Fritos\",\"precio\":15.488}";
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.put(BASE_URL + "/1a")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));

        System.out.println(result.andReturn().getResponse().getContentAsString());

    }

    @Test
    void deleteProduct() throws Exception{
        ProductResponseDto productResponseDto = new ProductResponseDto( "1a","Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        when(productService.findProductById("1a")).thenReturn(productResponseDto);

        String json = "{\"id\":\"1a\",\"Nombre\":\"Papas fritas\",\"Description\":\"bolsa de papas fritas\",\"category\":\"Fritos\",\"precio\":15.488}";
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.put(BASE_URL + "/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));

        System.out.println(result.andReturn().getResponse().getContentAsString());

    }*/
}