package com.rancho.service.implementation;

import java.util.List;
import com.rancho.model.Menu;
import com.rancho.repository.IMenuRepository;
import com.rancho.service.IMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class MenuService implements IMenuService {
    private final IMenuRepository repo;

    @Override
    public Menu save(Menu menu) throws Exception {
        return repo.save(menu);
    }

    @Override
    public List<Menu> saveAll(List<Menu> menus) throws Exception {
        return repo.saveAll(menus);
    }

    @Override
    public Menu update(Menu menu, Integer id) throws Exception {
        menu.setIdMenu(id);
        return repo.save(menu);
    }

    @Override
    public List<Menu> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Menu findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Menu());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
