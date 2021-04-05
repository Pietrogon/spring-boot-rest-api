package com.pietrogon.springbootrestapi.entity;

import javax.persistence.*;

@Entity
public class Role {
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}