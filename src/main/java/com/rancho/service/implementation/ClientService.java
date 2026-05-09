package com.rancho.service.implementation;

import java.util.List;

import com.rancho.model.Client;
import com.rancho.repository.IClientRepository;
import com.rancho.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository repo;

    @Override
    public Client save(Client client) throws Exception {
        return repo.save(client);
    }

    @Override
    public List<Client> saveAll(List<Client> clients) throws Exception {
        return repo.saveAll(clients);
    }

    @Override
    public Client update(Client client, Integer id) throws Exception {
        client.setIdClient(id);
        return repo.save(client);
    }

    @Override
    public List<Client> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Client findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Client());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
