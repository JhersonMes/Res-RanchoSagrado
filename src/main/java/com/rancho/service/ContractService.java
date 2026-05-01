package com.rancho.service;

import java.util.List;
import com.rancho.model.Contract;
import com.rancho.repository.IContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractService implements IContractService {

    private final IContractRepository repo;

    @Override
    public Contract save(Contract contract) throws Exception {
        return repo.save(contract);
    }

    @Override
    public Contract update(Contract contract, Integer id) throws Exception {
        contract.setIdContract(id);
        return repo.save(contract);
    }

    @Override
    public List<Contract> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Contract findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Contract());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}