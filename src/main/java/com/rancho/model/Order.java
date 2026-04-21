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
@Table(name = "orders") // Evita conflictos con la palabra reservada 'ORDER' en SQL
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idOrder;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "estado_pedido", nullable = false, length = 50)
    private String status; // PENDIENTE, EN_PROCESO, LISTO, ENTREGADO, CANCELADO

    @Column(name = "detalle_pedido", length = 255)
    private String detail; // Notas adicionales del pedido

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal subTotal; // Agregado según tu diagrama

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = true,
            foreignKey = @ForeignKey(name = "FK_ORDER_CLIENT"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_table", nullable = true,
            foreignKey = @ForeignKey(name = "FK_ORDER_TABLE"))
    private RestaurantTable restaurantTable;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false,
            foreignKey = @ForeignKey(name = "FK_ORDER_EMPLOYEE"))
    private Employee employee;
}