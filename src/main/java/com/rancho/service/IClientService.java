package com.rancho.service;

import com.rancho.model.Client;

import java.util.List;

public interface IClientService {
    Client save(Client client) throws Exception;
    Client update(Client client, Integer id) throws Exception;
    List<Client> findAll() throws Exception;
    Client findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
