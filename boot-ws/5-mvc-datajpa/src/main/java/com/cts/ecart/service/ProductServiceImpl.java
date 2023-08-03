package com.cts.ecart.service;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository prodRepo;


    public List<Category> listAllCategories(){
        return prodRepo.findAll();
    }

}
