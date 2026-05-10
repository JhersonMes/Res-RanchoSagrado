package com.rancho.repository;

import com.rancho.model.PaymentReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentReceiptRepository extends JpaRepository<PaymentReceipt, Integer> {
}