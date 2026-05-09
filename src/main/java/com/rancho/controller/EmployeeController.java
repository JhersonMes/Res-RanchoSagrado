package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Employee;
import com.rancho.service.IEmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") //CORS
public class EmployeeController {

    private final IEmployeeService service;

    @GetMapping
    public List<Employee> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee) throws Exception {
        return service.save(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@RequestBody Employee employee, @PathVariable("id") Integer id) throws Exception {
        return service.update(employee, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
