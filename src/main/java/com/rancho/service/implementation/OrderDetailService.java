package com.rancho.service.implementation;
import java.util.List;
import com.rancho.model.OrderDetail;
import com.rancho.repository.IOrderDetailRepository;
import com.rancho.service.IOrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDetailService implements IOrderDetailService {
    private final IOrderDetailRepository repo;

    @Override
    public OrderDetail save(OrderDetail orderDetail) throws Exception {
        return repo.save(orderDetail);
    }

    @Override
    public List<OrderDetail> saveAll(List<OrderDetail> details) throws Exception {
        return repo.saveAll(details);
    }

    @Override
    public OrderDetail update(OrderDetail orderDetail, Integer id) throws Exception {
        orderDetail.setIdOrderDetail(id);
        return repo.save(orderDetail);
    }

    @Override
    public List<OrderDetail> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public OrderDetail findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new OrderDetail());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
