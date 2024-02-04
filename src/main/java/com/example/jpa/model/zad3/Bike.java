package com.example.jpa.model.zad3;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Bike extends Vehicle{

    private String name;
    private String cost;
}
