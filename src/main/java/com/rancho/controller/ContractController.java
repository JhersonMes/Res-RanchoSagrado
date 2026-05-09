package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Contract;
import com.rancho.service.IContractService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/contracts")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") //CORS
public class ContractController {

    private final IContractService service;

    @GetMapping
    public List<Contract> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Contract findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Contract save(@RequestBody Contract contract) throws Exception {
        return service.save(contract);
    }

    @PutMapping("/{id}")
    public Contract update(@RequestBody Contract contract, @PathVariable("id") Integer id) throws Exception {
        return service.update(contract, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
