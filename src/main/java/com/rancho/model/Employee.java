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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmployee;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 100)
    private String role;

    @Column(nullable = false, length = 9)
    private String phone;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 15)
    private String status;

    @Column(nullable = false, length = 8, unique = true)
    private String dni;

    // Muchos a Muchos con Turnos (Como tu ejemplo de User y Role)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_shift",
            joinColumns = @JoinColumn(name = "id_employee", referencedColumnName = "idEmployee"),
            inverseJoinColumns = @JoinColumn(name = "id_shift", referencedColumnName = "idShift"),
            foreignKey = @ForeignKey(name = "FK_EMPLOYEE_SHIFT"),
            inverseForeignKey = @ForeignKey(name = "FK_SHIFT_EMPLOYEE")
    )
    private List<Shift> shifts;
}