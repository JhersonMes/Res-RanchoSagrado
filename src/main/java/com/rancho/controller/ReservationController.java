package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Reservation;
import com.rancho.service.IReservationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ReservationController {

    private final IReservationService service;

    @GetMapping
    public List<Reservation> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Reservation findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Reservation save(@RequestBody Reservation reservation) throws Exception {
        return service.save(reservation);
    }

    @PostMapping("/batch")
    public List<Reservation> saveAll(@RequestBody List<Reservation> reservations) throws Exception {
        return service.saveAll(reservations);
    }

    @PutMapping("/{id}")
    public Reservation update(@RequestBody Reservation reservation, @PathVariable("id") Integer id) throws Exception {
        return service.update(reservation, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}