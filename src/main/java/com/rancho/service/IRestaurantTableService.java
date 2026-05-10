package com.rancho.service;

import com.rancho.model.RestaurantTable;
import java.util.List;

public interface IRestaurantTableService {
    RestaurantTable save(RestaurantTable restaurantTable) throws Exception;
    List<RestaurantTable> saveAll(List<RestaurantTable> tables) throws Exception;
    RestaurantTable update(RestaurantTable restaurantTable, Integer id) throws Exception;
    List<RestaurantTable> findAll() throws Exception;
    RestaurantTable findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}