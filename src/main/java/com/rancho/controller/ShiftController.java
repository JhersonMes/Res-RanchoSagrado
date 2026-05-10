package com.rancho.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.rancho.model.Shift;
import com.rancho.service.IShiftService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/shifts")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ShiftController {

    private final IShiftService service;

    @GetMapping
    public List<Shift> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Shift findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Shift save(@RequestBody Shift shift) throws Exception {
        return service.save(shift);
    }

    @PutMapping("/{id}")
    public Shift update(@RequestBody Shift shift, @PathVariable("id") Integer id) throws Exception {
        return service.update(shift, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}