package com.rancho.service;

import com.rancho.model.Role;
import java.util.List;

public interface IRoleService {
    Role save(Role role) throws Exception;
    Role update(Role role, Integer id) throws Exception;
    List<Role> findAll() throws Exception;
    Role findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}