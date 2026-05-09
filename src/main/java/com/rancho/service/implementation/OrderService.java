package com.rancho.service.implementation;

import com.rancho.service.IOrderService;
import java.util.List;
import com.rancho.model.Order;
import com.rancho.repository.IOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {
    private final IOrderRepository repo;

    @Override
    public Order save(Order order) throws Exception {
        return repo.save(order);
    }

    @Override
    public List<Order> saveAll(List<Order> orders) throws Exception {
        return repo.saveAll(orders);
    }

    @Override
    public Order update(Order order, Integer id) throws Exception {
        order.setIdOrder(id);
        return repo.save(order);
    }

    @Override
    public List<Order> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Order findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Order());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
