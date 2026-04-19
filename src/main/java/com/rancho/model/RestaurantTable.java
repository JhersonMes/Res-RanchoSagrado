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
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idTable;

    @Column(nullable = false)//NO PUEDE SER NULO---OJO!!
    private Integer tableNumber;

    @Column(nullable = false)//NO PUEDE SER NULO----OJO!! 
    private Integer capacity;

    @Column(nullable = false, length = 20)
    private String status; // LIBRE, OCUPADA, RESERVADA
}
