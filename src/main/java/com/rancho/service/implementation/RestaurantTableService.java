package com.rancho.service.implementation;

import java.util.List;
import com.rancho.model.RestaurantTable;
import com.rancho.repository.IRestaurantTableRepository;
import com.rancho.service.IRestaurantTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantTableService implements IRestaurantTableService {

    private final IRestaurantTableRepository repo;

    @Override
    public RestaurantTable save(RestaurantTable restaurantTable) throws Exception {
        return repo.save(restaurantTable);
    }

    @Override
    public List<RestaurantTable> saveAll(List<RestaurantTable> tables) throws Exception {
        return repo.saveAll(tables);
    }

    @Override
    public RestaurantTable update(RestaurantTable restaurantTable, Integer id) throws Exception {
        restaurantTable.setIdTable(id);
        return repo.save(restaurantTable);
    }

    @Override
    public List<RestaurantTable> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public RestaurantTable findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new RestaurantTable());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}