package com.store.hs.domain;

import javax.persistence.*;

@Entity
@Table(name = "bill_product")
public class BillProduct {
    @EmbeddedId
    private BillProductKey billProductKey;
    @ManyToOne
    @MapsId("billId")
    @JoinColumn(name = "bill_id")
    private Bill bill;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer amountOfProduct;

    public BillProduct(){}

    public Bill getBill() {
        return bill;
    }

    public Product getProduct() {
        return product;
    }

    public BillProductKey getBillProductKey() {
        return billProductKey;
    }

    public Integer getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setBillProductKey(BillProductKey billProductKey) {
        this.billProductKey = billProductKey;
    }

    public void setAmountOfProduct(Integer amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }
}
