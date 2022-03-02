package com.example.BootcampMsMobileApp.repository;

import java.util.Map;

import com.example.BootcampMsMobileApp.model.Yanki;

public interface RedisRepository {
    Map<String, Yanki> findAll();
    Yanki findById(String id);
    void save(Yanki yanki);
    void delete(String id);

    
}
