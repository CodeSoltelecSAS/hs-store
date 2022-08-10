package com.store.hs.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @Column(name = "product_categories")
    private long Id;
    @Column(name = "name_category", nullable = false, length = 30)
    private String nameCategory;

    @OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL)
    private List<Product> productList;

    public ProductCategory() {
    }

    public ProductCategory(String nameCategory, List<Product> productList){
        super();
        this.nameCategory = nameCategory;
        this.productList = productList;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public long getId() {
        return Id;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
