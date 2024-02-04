package com.example.jpa.model.zad2;

import jakarta.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCity;
    @ManyToOne
    private Country country;
}
