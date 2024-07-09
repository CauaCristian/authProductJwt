package com.caua.authproductjwt.controllers;

import com.caua.authproductjwt.models.ProductModel;
import com.caua.authproductjwt.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired()
    private ProductService productService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductModel> findAll(){
        return productService.findAll();
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductModel findById(@PathVariable Long id){
        return productService.findById(id);
    }
}
