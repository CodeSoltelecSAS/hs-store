package com.store.hs.domain;

import javax.persistence.*;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "name_company", nullable = false, length = 40)
    private String nameCompany;
    @Column(name = "phone", nullable = false, length = 10)
    private String phone;
    @Column(name = "email", length = 40)
    private String email;

    public Provider(){}

    public Provider(String name, String nameCompany, String phone, String email){
        super();
        this.name = name;
        this.nameCompany = nameCompany;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {

        return Id;
    }

    public void setId(Long id) {

        Id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getNameCompany() {

        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {

        this.nameCompany = nameCompany;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
