package com.codegym.repository;

import com.codegym.model.Product;
import com.codegym.model.ProductMedia;
import com.codegym.model.dto.IProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ProductMediaRepository extends JpaRepository<ProductMedia, String> {
    Optional<ProductMedia> findByProduct(Product product);
}
