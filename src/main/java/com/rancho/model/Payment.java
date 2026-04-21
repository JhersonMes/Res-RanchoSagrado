package com.rancho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPayment; // MODIFICADOR DE ACCESO

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount; // BigDecimal----> MANEJAR NUMEROS DECIMALES CON ALTA PRECISIÓN

    @Column(nullable = false, length = 30)
    private String paymentMethod; // EFECTIVO, TARJETA, YAPE, PLIN

    @Column(nullable = false, length = 100)
    private String cardDetails;

    @Column(nullable = false, length = 20)
    private String status; // PAGADO, PENDIENTE, REEMBOLSADO

    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false,
            foreignKey = @ForeignKey(name = "FK_PAYMENT_ORDER"))
    private Order order;
}
