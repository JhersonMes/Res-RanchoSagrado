package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.PaymentReceipt;
import com.rancho.service.IPaymentReceiptService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/payment-receipts")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PaymentReceiptController {

    private final IPaymentReceiptService service;

    @GetMapping
    public List<PaymentReceipt> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PaymentReceipt findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public PaymentReceipt save(@RequestBody PaymentReceipt receipt) throws Exception {
        return service.save(receipt);
    }

    @PostMapping("/batch")
    public List<PaymentReceipt> saveAll(@RequestBody List<PaymentReceipt> receipts) throws Exception {
        return service.saveAll(receipts);
    }

    @PutMapping("/{id}")
    public PaymentReceipt update(@RequestBody PaymentReceipt receipt, @PathVariable("id") Integer id) throws Exception {
        return service.update(receipt, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}