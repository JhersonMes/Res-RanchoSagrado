package com.rancho.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Menu;
import com.rancho.service.IMenuService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class MenuController {
    private final IMenuService service;

    @GetMapping
    public List<Menu> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Menu findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Menu save(@RequestBody Menu menu) throws Exception {
        return service.save(menu);
    }

    @PostMapping("/batch")
    public List<Menu> saveAll(@RequestBody List<Menu> menus) throws Exception {
        return service.saveAll(menus);
    }

    @PutMapping("/{id}")
    public Menu update(@RequestBody Menu menu, @PathVariable("id") Integer id) throws Exception {
        return service.update(menu, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
