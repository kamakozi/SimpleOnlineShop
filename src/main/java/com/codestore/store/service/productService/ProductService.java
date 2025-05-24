package com.codestore.store.service.productService;

import com.codestore.store.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity getProductById(Long id);
    ProductEntity saveProduct(ProductEntity product);
    void deleteProduct(Long id);
}
