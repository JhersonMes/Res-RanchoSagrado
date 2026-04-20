package com.rancho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idReservation;

    @Column(nullable = false)
    private LocalDateTime reservationDate;

    @Column(nullable = false)
    private Integer numberOfPeople;

    @Column(nullable = false, length = 20)
    private String status; // PENDIENTE, CONFIRMADA, CANCELADA

    @Column(nullable = true, length = 300)
    private String notes;

    @Column(length = 100)
    private String specialOccasion;

    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "idTable", nullable = false)
    private RestaurantTable restaurantTable;
}
