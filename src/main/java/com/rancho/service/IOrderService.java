package com.rancho.service;

import com.rancho.model.Order;

import java.util.List;

public interface IOrderService {
    Order save(Order order) throws Exception;
    List<Order> saveAll(List<Order> orders) throws Exception;
    Order update(Order order, Integer id) throws Exception;
    List<Order> findAll() throws Exception;
    Order findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
