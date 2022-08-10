package com.store.hs.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BillProductKey implements Serializable {
    @Column(name = "bill_id")
    private Long billId;
    @Column(name = "product_id")
    private Long productId;

    public BillProductKey(){}

    public Long getBillId() {
        return billId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
