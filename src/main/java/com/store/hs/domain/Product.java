package com.store.hs.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false)
    private long Id;
    @Column(name = "product_name", nullable = false, length = 60)
    private String productName;
    @Column(name = "marca", length = 60)
    private String marca;
    @Column(name = "product_measure", nullable = false)
    private Float measure;
    @Column(name = "iva", nullable = false)
    private Float iva;
    @Column(name = "product_cost", nullable = false)
    private Float cost;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id", nullable = false, referencedColumnName = "product_categories")
    private ProductCategory productCategory;

    public Product(){}

    public Product(String productName, String marca, Float measure, Float iva, Float cost, ProductCategory productCategory){
        super();
        this.productName = productName;
        this.marca = marca;
        this.iva = iva;
        this.measure = measure;
        this.cost = cost;
        this.productCategory = productCategory;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMeasure(Float measure) {
        this.measure = measure;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public long getId() {
        return Id;
    }

    public String getProductName() {
        return productName;
    }

    public String getMarca() {
        return marca;
    }

    public Float getMeasure() {
        return measure;
    }

    public Float getIva() {
        return iva;
    }

    public Float getCost() {
        return cost;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

}
