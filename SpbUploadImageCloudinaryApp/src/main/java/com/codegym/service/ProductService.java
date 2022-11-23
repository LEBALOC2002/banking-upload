package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.dto.IProductDTO;
import com.codegym.model.dto.ProductDTO;

import java.io.IOException;
import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(String id);

    Iterable<IProductDTO> findAllIProductDTO();

    IProductDTO findIProductDTOById(String id);

    Product create(ProductDTO productDTO);

    void delete(Product product) throws IOException;
}
