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
@Table(name = "users")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idUser;

    @Column(nullable = false, length = 50, unique = true)
    private String username;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    // Relación 1:1 con Empleado
    @OneToOne
    @JoinColumn(name = "id_employee", nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_EMPLOYEE"))
    private Employee employee;

    // Relación Muchos a Muchos con Roles
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"),
            foreignKey = @ForeignKey(name = "FK_USER_ROLE"),
            inverseForeignKey = @ForeignKey(name = "FK_ROLE_USER")
    )
    private List<Role> roles;
}