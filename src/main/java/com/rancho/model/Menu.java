package com.rancho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Menu {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMenu;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer dishQuantity;

    @Column(length = 100)
    private String description;

    @Column(nullable = false, precision = 8, scale = 2)
    private BigDecimal price;
}