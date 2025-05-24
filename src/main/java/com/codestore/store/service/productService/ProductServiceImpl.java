package com.codestore.store.service.productService;

import com.codestore.store.entity.ProductEntity;
import com.codestore.store.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){

        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public  ProductEntity saveProduct(ProductEntity product){
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
