package com.procesos.automovil.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Automovil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Cars")
    private String cars;

    private String car_model;

    private String car_color;

    private String car_model_year;

    private String car_vin;

    private String price;

    private String availability;
}
