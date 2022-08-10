package com.store.hs.domain;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_bill", nullable = false)
    private long idBill;

    public Bill() {}

    public long getBillId() {
        return idBill;
    }
}
