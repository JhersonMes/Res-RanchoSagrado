package com.rancho.service.implementation;

import java.util.List;
import com.rancho.model.Role;
import com.rancho.repository.IRoleRepository;
import com.rancho.service.IRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService implements IRoleService {

    private final IRoleRepository repo;

    @Override
    public Role save(Role role) throws Exception {
        return repo.save(role);
    }

    @Override
    public Role update(Role role, Integer id) throws Exception {
        role.setIdRole(id);
        return repo.save(role);
    }

    @Override
    public List<Role> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Role findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Role());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}