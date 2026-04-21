package com.rancho.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="categories", schema="sales")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include // Identidad única
    private Integer idClient;
    @Column(nullable = false, length = 8)
    private Integer dni;
    @Column(nullable = false, length = 70)//name="nombre")
    private String name;
    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(length = 9)
    private String phone;

    @Column(length = 100)
    private String email;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(length = 150)
    private String address;

    @Column(length = 11, unique = true)
    private String ruc;
}
