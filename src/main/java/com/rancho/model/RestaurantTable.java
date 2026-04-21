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
@Table(name = "restaurant_tables")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idTable;

    @Column(name = "numero_mesa", nullable = false)
    private Integer tableNumber;

    @Column(name = "capacidad", nullable = false)
    private Integer capacity;

    @Column(name = "ubicacion", length = 100)
    private String location;

    @Column(name = "estado", nullable = false, length = 20)
    private String status; // DISPONIBLE, OCUPADA, RESERVADA
}