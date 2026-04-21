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
@Table(name = "payment_receipts")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PaymentReceipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idReceipt;

    // Relación 1:1 con Pedido
    @OneToOne
    @JoinColumn(name = "id_order", nullable = false,
            foreignKey = @ForeignKey(name = "FK_RECEIPT_ORDER"))
    private Order order;

    @Column(name = "tipo_comprobante", nullable = false, length = 30)
    private String receiptType; // BOLETA, FACTURA

    @Column(name = "numero_comprobante", nullable = false, length = 10)
    private String receiptNumber;

    @Column(nullable = false, length = 10)
    private String series; // Serie del comprobante

    @Column(name = "fecha_emision", nullable = false)
    private LocalDateTime emissionDate;

    @Column(name = "sub_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal subTotal;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal igv; // Impuesto General a las Ventas

    @Column(name = "monto_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "estado_comprobante", nullable = false, length = 30)
    private String status; // EMITIDO, ANULADO

    @Column(name = "metodo_pago", nullable = false, length = 30)
    private String paymentMethod;

    // Datos para Facturación (RUC)
    @Column(name = "razon_social", length = 200)
    private String businessName;

    @Column(length = 11)
    private String ruc;

    @Column(name = "direccion_fiscal", length = 200)
    private String fiscalAddress;
}