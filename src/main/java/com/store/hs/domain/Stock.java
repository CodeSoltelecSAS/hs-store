package com.store.hs.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stock_products")
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @OneToOne
    @JoinColumn(name = "product_id_fk", referencedColumnName = "product_id")
    private Product product;
    @Column(name = "amount_of_product")
    private Integer amountOfProduct;

    public Stock(){}

    public Stock(Integer amountOfProduct, Product product){
        super();
        this.amountOfProduct = amountOfProduct;
        this.product = product;
    }

    public void setAmountOfProduct(Integer amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmountOfProduct() {
        return amountOfProduct;
    }

    public Product getProduct() {
        return product;
    }
}
