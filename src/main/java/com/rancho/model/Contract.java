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
public class Contract {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContract;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = true)
    private LocalDate endDate;

    @Column(nullable = false, length = 50)
    private String contractType;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

    @Column(nullable = true, length = 500)
    private String clause;

    // Relación Muchos a Uno con Empleado (La "pata de gallo" está en esta clase)
    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false,
            foreignKey = @ForeignKey(name = "FK_CONTRACT_EMPLOYEE"))
    private Employee employee;

    // Relación Muchos a Uno con Proveedor
    @ManyToOne
    @JoinColumn(name = "id_provider", nullable = true,
            foreignKey = @ForeignKey(name = "FK_CONTRACT_PROVIDER"))
    private Supplier supplier;
}