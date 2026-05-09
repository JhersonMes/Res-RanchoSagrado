package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Client;
import com.rancho.service.IClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor // genera el constructor por defecto sin argumentos
@CrossOrigin(origins = "*") //CORS
public class ClientController {

    private final IClientService service;

    @GetMapping
    public List<Client> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}") // TRAE A UN CLIENTE POR SU ID EJEMPLO HTTP<:9090/clients/1 GET UNO POR UNO
    public Client findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Client save(@RequestBody Client client) throws Exception {
        return service.save(client);
    }

    @PostMapping("/batch")
    public List<Client> saveAll(@RequestBody List<Client> clients) throws Exception {
        return service.saveAll(clients);
    }

    @PutMapping("/{id}") // MODIFICA O ACTUALIZA LOS DATOS DE UN CLIENTE YA EXISTENTE EJEMPLO
                         // HTTP<:9090/clients/1 PUT RECIBE UN
                         // BODY JSON CON LOS DATOS DEL CLIENTE
    public Client update(@RequestBody Client client, @PathVariable("id") Integer id) throws Exception {
        return service.update(client, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
