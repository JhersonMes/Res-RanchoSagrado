package com.rancho.service;

import com.rancho.model.Shift;
import java.util.List;

public interface IShiftService {
    Shift save(Shift shift) throws Exception;
    Shift update(Shift shift, Integer id) throws Exception;
    List<Shift> findAll() throws Exception;
    Shift findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}