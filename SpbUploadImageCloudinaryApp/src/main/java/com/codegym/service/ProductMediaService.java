package com.codegym.service;

import com.codegym.model.ProductMedia;

public interface ProductMediaService {
    Iterable<ProductMedia> findAll();

    ProductMedia create(ProductMedia productMedia);

    void delete(ProductMedia productMedia);
}
