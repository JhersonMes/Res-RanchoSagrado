package com.rancho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Inventory {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInventory;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal stockQuantity;

    @Column(nullable = false)
    private LocalDate lastReplenishmentDate;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal minStock;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal maxStock;

    // Relación Muchos a Uno con Ingrediente
    @ManyToOne
    @JoinColumn(name = "id_ingredient", nullable = false,
            foreignKey = @ForeignKey(name = "FK_INVENTORY_INGREDIENT"))
    private Ingredient ingredient;
}