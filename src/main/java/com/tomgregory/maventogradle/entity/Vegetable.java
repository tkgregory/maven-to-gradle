package com.tomgregory.maventogradle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description;
    private String nutritionalBenefit;

    public Vegetable() {
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getNutritionalBenefit() {
        return nutritionalBenefit;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", nutritionalBenefit='" + nutritionalBenefit + '\'' +
                '}';
    }
}
