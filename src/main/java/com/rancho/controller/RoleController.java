package com.rancho.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.rancho.model.Role;
import com.rancho.service.IRoleService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class RoleController {

    private final IRoleService service;

    @GetMapping
    public List<Role> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Role save(@RequestBody Role role) throws Exception {
        return service.save(role);
    }

    @PutMapping("/{id}")
    public Role update(@RequestBody Role role, @PathVariable("id") Integer id) throws Exception {
        return service.update(role, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}