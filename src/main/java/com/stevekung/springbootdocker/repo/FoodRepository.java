package com.stevekung.springbootdocker.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stevekung.springbootdocker.data.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>
{
    Optional<Food> findByName(String name);

    boolean existsByName(String name);

    void deleteByName(String name);
}