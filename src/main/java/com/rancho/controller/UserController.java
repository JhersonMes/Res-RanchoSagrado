package com.rancho.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.rancho.model.User;
import com.rancho.service.IUserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {

    private final IUserService service;

    @GetMapping
    public List<User> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) throws Exception {
        return service.save(user);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable("id") Integer id) throws Exception {
        return service.update(user, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}