package com.store.hs.domain;

import javax.persistence.*;

@Entity
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_seller")
    private Long Id;
    @Column(name = "name_seller", length = 50, nullable = false)
    private String name;
    @Column(name = "phone_seller", length = 10, nullable = false)
    private String phone;

    public Seller(){}

    public Seller(String name, String phone){
        super();
        this.name = name;
        this.phone = phone;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
