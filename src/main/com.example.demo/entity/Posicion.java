package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "posicion")
public class Posicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    // Getters y Setters
}
