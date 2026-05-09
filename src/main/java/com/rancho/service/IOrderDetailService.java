package com.rancho.service;

import com.rancho.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail save(OrderDetail orderDetail) throws Exception;
    List<OrderDetail> saveAll(List<OrderDetail> details) throws Exception;
    OrderDetail update(OrderDetail orderDetail, Integer id) throws Exception;
    List<OrderDetail> findAll() throws Exception;
    OrderDetail findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
