package com.rancho.service.implementation;

import java.util.List;
import com.rancho.model.User;
import com.rancho.repository.IUserRepository;
import com.rancho.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final IUserRepository repo;

    @Override
    public User save(User user) throws Exception {
        return repo.save(user);
    }

    @Override
    public User update(User user, Integer id) throws Exception {
        user.setIdUser(id);
        return repo.save(user);
    }

    @Override
    public List<User> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public User findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new User());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}