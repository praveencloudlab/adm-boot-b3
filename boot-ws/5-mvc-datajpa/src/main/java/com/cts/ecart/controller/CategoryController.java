package com.cts.ecart.controller;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.ProductRepository;
import com.cts.ecart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private ProductService prodService;
    @RequestMapping(value = "/listCategories")
    public String listCategories(ModelMap model){

        List<Category> categories= prodService.listAllCategories();

        model.put("categories",categories);
        return "categories";
    }


}
