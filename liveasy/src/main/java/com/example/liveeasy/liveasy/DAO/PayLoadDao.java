package com.example.liveeasy.liveasy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.liveeasy.liveasy.Entities.PayLoad;
@Repository
public interface PayLoadDao extends JpaRepository<PayLoad, Integer>{
    
}
