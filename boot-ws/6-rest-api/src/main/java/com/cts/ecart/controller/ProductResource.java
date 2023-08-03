package com.cts.ecart.controller;

import com.cts.ecart.entity.Category;
import com.cts.ecart.model.Product;
import com.cts.ecart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductResource {

    @Autowired
    private ProductRepository prodRepo;

    @GetMapping
    public List<Category> f1(){
        return prodRepo.findAll();
    }

    @GetMapping("/{id}")
    public String f11(@PathVariable int id){
        return "GET MAPPING - "+id;
    }

    @GetMapping("/filter/{name}")
    public String f111(@PathVariable String name){
        return "GET MAPPING - "+name;
    }

    @GetMapping("/filter/price/{price}")
    public String f1111(@PathVariable double price){
        return "GET MAPPING - "+price;
    }

    @PostMapping
    public Product f2(@RequestBody Product prod){
        System.out.println(prod);
        return prod;
    }

    @PutMapping
    public String f3(){
        // ?????
        return "PUT MAPPING";
    }

    @PatchMapping
    public String f4(){
        return "PATCH MAPPING";
    }

    @DeleteMapping
    public String f5(){
        return "DELETE MAPPING";
    }


}
