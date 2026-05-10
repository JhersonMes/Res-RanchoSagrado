package com.rancho.service;

import com.rancho.model.User;
import java.util.List;

public interface IUserService {
    User save(User user) throws Exception;
    User update(User user, Integer id) throws Exception;
    List<User> findAll() throws Exception;
    User findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}