package com.backend.reactjs.service;


import java.util.List;

import com.backend.reactjs.entity.Position;
import com.backend.reactjs.repository.IPossitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PossitionService implements IPossitionService {

    @Autowired
    private IPossitionRepository possitionRepository;

    @Override
    public List<Position> getAllPossition() {
        // TODO Auto-generated method stub
        return possitionRepository.findAll();
    }

}

