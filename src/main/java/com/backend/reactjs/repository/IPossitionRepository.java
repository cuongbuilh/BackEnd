package com.backend.reactjs.repository;

import com.backend.reactjs.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPossitionRepository extends JpaRepository<Position, Short>{

}
