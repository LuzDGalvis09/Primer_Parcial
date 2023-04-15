package com.procesos.automovil.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Automovil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cars")
    private String cars;
    @Column(name = "car_model")
    private String car_model;
    @Column(name = "car_color")
    private String car_color;
    @Column(name = "car_model_year")
    private String car_model_year;
    @Column(name = "car_vin")
    private String car_vin;
    @Column(name = "price")
    private String price;
    @Column(name = "availability")
    private String availability;
}
