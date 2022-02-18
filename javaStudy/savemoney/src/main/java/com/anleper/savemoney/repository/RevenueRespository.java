package com.anleper.savemoney.repository;

import com.anleper.savemoney.model.Revenue;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RevenueRespository extends JpaRepository<Revenue,Long>{
    Revenue findOneById(Long id);
}
