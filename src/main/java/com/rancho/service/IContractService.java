package com.rancho.service;

import com.rancho.model.Contract;
import java.util.List;

public interface IContractService {
    Contract save(Contract contract) throws Exception;
    Contract update(Contract contract, Integer id) throws Exception;
    List<Contract> findAll() throws Exception;
    Contract findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}