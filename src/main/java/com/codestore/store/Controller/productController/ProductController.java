package com.codestore.store.Controller.productController;

import com.codestore.store.entity.ProductEntity;
import com.codestore.store.service.productService.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity>getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductEntity getProductById(Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
