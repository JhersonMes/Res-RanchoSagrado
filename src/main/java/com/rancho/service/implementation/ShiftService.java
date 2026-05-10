package com.rancho.service.implementation;

import java.util.List;
import com.rancho.model.Shift;
import com.rancho.repository.IShiftRepository;
import com.rancho.service.IShiftService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShiftService implements IShiftService {

    private final IShiftRepository repo;

    @Override
    public Shift save(Shift shift) throws Exception {
        return repo.save(shift);
    }

    @Override
    public Shift update(Shift shift, Integer id) throws Exception {
        shift.setIdShift(id);
        return repo.save(shift);
    }

    @Override
    public List<Shift> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Shift findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Shift());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}