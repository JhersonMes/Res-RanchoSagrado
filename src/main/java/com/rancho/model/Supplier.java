package com.rancho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Supplier {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSupplier;

    @Column(nullable = false, length = 200)
    private String companyName;

    @Column(nullable = false, length = 11, unique = true)
    private String ruc;

    @Column(nullable = false, length = 100, unique = true)
    private String contactEmail;

    @Column(nullable = false, length = 9)
    private String phone;

    @Column(nullable = false, length = 250)
    private String address;

    @Column(nullable = false, length = 200)
    private String supplyType;

    @Column(nullable = false, length = 50)
    private String status;
}