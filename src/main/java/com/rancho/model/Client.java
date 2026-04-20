package com.rancho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
// @Table(name="categories", schema="sales")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include // Identidad única
    private Integer idClient;
    @Column(nullable = false, length = 8)
    private Integer dni;
    @Column(nullable = false, length = 70) // name="nombre")
    private String name;
    @Column(nullable = false, length = 30)
    private String email;
    @Column(nullable = false, length = 10)
    private Integer numb;

    @Column(length = 50)
    private String lastName;

    @Column(length = 9)
    private String phone;

    @Column
    private java.time.LocalDate birthDate;

    @Column(length = 150)
    private String address;

    @Column(length = 11)
    private String ruc;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reservation> reservations;
}
