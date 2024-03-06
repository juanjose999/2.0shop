package com.tienda.service;

import com.tienda.model.dto.product.ProductDto;
import com.tienda.model.dto.product.ProductResponseDto;
import com.tienda.model.product.Producto;
import com.tienda.repository.product.ProductRepository;
import com.tienda.service.product.ProductServiceImplement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class ProductServiceTest {
    /*

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImplement productServiceImplement;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllProduct_returnProductRespondeDtoList(){
        when(productRepository.getAllProduct()).thenReturn(Arrays.asList(
                new Producto("Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1"),
                new Producto("Carne molida", "1k de carne molida", "Carnes", "Proteina, animal", 20000, "URL2")
        ));

        List<ProductResponseDto> result = productServiceImplement.getAllProduct();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Papas fritas Margaritas", result.get(0).getNombre());
        assertEquals(2300, result.get(0).getPrecio());
        assertEquals("Carne molida", result.get(1).getNombre());
        assertEquals(20000, result.get(1).getPrecio());
    }

    @Test
    void findProductById_returnProductResponseDto(){

        String productId = "1234";

        Producto mockProduct = new Producto("Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        mockProduct.setIdProduct(productId);
        when(productRepository.findProductById(productId)).thenReturn(mockProduct);

        ProductResponseDto result = productServiceImplement.findProductById(productId);

        assertNotNull(result);
        assertEquals(productId, mockProduct.getIdProduct());
    }

    @Test
    void saveProduct_ReturnProductResponseDto(){
        ProductDto productDto = new ProductDto("Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        when(productRepository.saveProduct(any())).thenReturn(
                new Producto("Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1"));
        ProductResponseDto result = productServiceImplement.saveProduct(productDto);

        assertNotNull(result);
        assertEquals("Papas fritas Margaritas", result.getNombre());
        assertEquals("Fritos", result.getCategoria());
        assertEquals(2300, result.getPrecio());
    }

    @Test
    void updateProduct(){

        String productId = "590";
        ProductDto productDto = new ProductDto("Papas fritas Margaritas", "bolsa de papas fritas 30gr", "Fritos", "paquetes, margaritas", 2300, "URL1");
        when(productRepository.updateProduct(eq(productId), any())).thenAnswer(invocation -> {
            Producto updatedProduct = invocation.getArgument(1); //  actualizado pasado al método
            assertEquals(productDto.getNombre(), updatedProduct.getNombre());
            return true;
        });

        Boolean result = productServiceImplement.updateProduct(productId, productDto);

        assertTrue(result);
    }

    @Test
    void deleteProductById(){
        String idProduct = "345";

        when(productRepository.deleteProductById(idProduct)).thenReturn(true);

        Boolean result = productServiceImplement.deleteProductById(idProduct);

        assertTrue(result);
    }*/
}
