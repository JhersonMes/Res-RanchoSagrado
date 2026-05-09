package com.rancho.service;

import com.rancho.model.Menu;

import java.util.List;

public interface IMenuService {
    Menu save(Menu menu) throws Exception;
    List<Menu> saveAll(List<Menu> menus) throws Exception;
    Menu update(Menu menu, Integer id) throws Exception;
    List<Menu> findAll() throws Exception;
    Menu findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
