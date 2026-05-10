package com.rancho.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.rancho.model.RestaurantTable;
import com.rancho.service.IRestaurantTableService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/restaurant-tables")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class RestaurantTableController {

    private final IRestaurantTableService service;

    @GetMapping
    public List<RestaurantTable> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RestaurantTable findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public RestaurantTable save(@RequestBody RestaurantTable restaurantTable) throws Exception {
        return service.save(restaurantTable);
    }

    @PutMapping("/{id}")
    public RestaurantTable update(@RequestBody RestaurantTable restaurantTable, @PathVariable("id") Integer id) throws Exception {
        return service.update(restaurantTable, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}