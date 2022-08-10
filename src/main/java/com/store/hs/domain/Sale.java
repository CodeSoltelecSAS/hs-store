package com.store.hs.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "sale")
public class Sale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_sale")
    private long idSale;
    @Id
    @OneToOne
    @JoinColumn(name = "id_bill", referencedColumnName = "id_bill")
    private Bill bill;
    @Id
    @OneToOne
    @JoinColumn(name = "id_seller", referencedColumnName = "id_seller")
    private Seller seller;

    public Sale(){}

    public Bill getBill() {
        return bill;
    }

    public Seller getSeller() {
        return seller;
    }

    public long getIdSale() {
        return idSale;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
