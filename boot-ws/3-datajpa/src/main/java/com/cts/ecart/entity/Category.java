package com.cts.ecart.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

@Entity(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryTitle;
    @Value("${name}")
    @Transient
    private String personName;



    public int getCategoryId() {
        System.out.println(">>>>>>> NAME :::: "+personName+" <<<<<<<<<<");
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }



    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryTitle='" + categoryTitle + '\'' +
                '}';
    }
}
