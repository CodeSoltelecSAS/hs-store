package com.store.hs.domain;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    private Long Id;
    @Column(name = "email_account", length = 60, nullable = false)
    private String email;
    @Column(name = "password_account", nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "id_seller", referencedColumnName = "id_seller")
    private Seller seller;

    public Account() {
    }

    public Account(String email, String password, Seller seller){
        super();
        this.email = email;
        this.password = password;
        this.seller = seller;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getEmail(){

        return email;
    }

    public String getPassword(){

        return password;
    }

    public Seller getSeller() {
        return seller;
    }
}
