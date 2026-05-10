package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Promotion;
import com.rancho.service.IPromotionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/promotions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PromotionController {

    private final IPromotionService service;

    @GetMapping
    public List<Promotion> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Promotion findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Promotion save(@RequestBody Promotion promotion) throws Exception {
        return service.save(promotion);
    }

    @PostMapping("/batch")
    public List<Promotion> saveAll(@RequestBody List<Promotion> promotions) throws Exception {
        return service.saveAll(promotions);
    }

    @PutMapping("/{id}")
    public Promotion update(@RequestBody Promotion promotion, @PathVariable("id") Integer id) throws Exception {
        return service.update(promotion, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}