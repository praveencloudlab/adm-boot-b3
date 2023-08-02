package com.cts.ecart.controller;

import com.cts.ecart.model.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
//@Scope(value = "session")
public class ProductController {

    @RequestMapping(value = "/s1")
    public String f1(){
        System.out.println(">>>>>>> f1 method <<<<<<<<<<");
        return "one"; // view name
    }

    @RequestMapping(value = "/s2")
    @ResponseBody
    public String f2(){
        return "Hello Praveen! How are you?"; // plan text/ html to be displayed  in the browser
    }

    @RequestMapping(value = "/s3")
    public String f3(ModelMap model){
        String user="Admin";

        model.put("username",user);
        model.put("city","London...");

        return "two"; // view name : two.html inside templates folder of src
    }

    @RequestMapping(value = "/s4")
    public String f4(){
        System.out.println(">>>>. F4 Method <<<<<<");
        return "redirect:/s3";
    }

    // laod form

    @RequestMapping(value = "/loadProdForm")
    public String loadProdForm(){
        return  "product-form";
    }

    @RequestMapping(value = "/saveProduct")
    public String save(@RequestParam("name")String pname,@RequestParam("price")double price,@RequestParam("description")String description){
        System.out.println("pname is "+pname);
        System.out.println("Price: "+price);
        System.out.println("Descriptiion: "+description);
        return "product-form";
    }
    @RequestMapping(value = "/saveProductV1")
    public String saveV1(@ModelAttribute Product prod){
        System.out.println(prod);
    return "product-form";
    }




}
