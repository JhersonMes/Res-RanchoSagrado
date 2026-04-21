package com.rancho.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPromotion;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = true, length = 300)
    private String description;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal discountPercentage;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private boolean status;

    // Agrega esto a tu clase Promotion
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "product_promotion",
            joinColumns = @JoinColumn(name = "id_promotion"),
            inverseJoinColumns = @JoinColumn(name = "id_product"),
            foreignKey = @ForeignKey(name = "FK_PROMOTION_PRODUCT"),
            inverseForeignKey = @ForeignKey(name = "FK_PRODUCT_PROMOTION")
    )
    private List<Product> products;
}
