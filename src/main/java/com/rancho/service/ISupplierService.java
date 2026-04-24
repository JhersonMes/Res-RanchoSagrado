package com.rancho.service;

import com.rancho.model.Supplier;

import java.util.List;

public interface ISupplierService {
    Supplier save(Supplier supplier) throws Exception;
    Supplier update(Supplier supplier, Integer id) throws Exception;
    List<Supplier> findAll() throws Exception;
    Supplier findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
