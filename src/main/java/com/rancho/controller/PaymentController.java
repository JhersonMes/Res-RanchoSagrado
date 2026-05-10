package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Payment;
import com.rancho.service.IPaymentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // CORS habilitado para el frontend
public class PaymentController {

    private final IPaymentService service;

    @GetMapping
    public List<Payment> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Payment findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Payment save(@RequestBody Payment payment) throws Exception {
        return service.save(payment);
    }

    @PostMapping("/batch")
    public List<Payment> saveAll(@RequestBody List<Payment> payments) throws Exception {
        return service.saveAll(payments);
    }

    @PutMapping("/{id}")
    public Payment update(@RequestBody Payment payment, @PathVariable("id") Integer id) throws Exception {
        return service.update(payment, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}