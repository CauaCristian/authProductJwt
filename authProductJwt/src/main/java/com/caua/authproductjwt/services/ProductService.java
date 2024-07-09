package com.caua.authproductjwt.services;

import com.caua.authproductjwt.models.ProductModel;
import com.caua.authproductjwt.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired()
    private ProductRepository productRepository;

    public List<ProductModel> findAll(){
        return productRepository.findAll();
    }

    public ProductModel findById(Long id){
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
    }

}
