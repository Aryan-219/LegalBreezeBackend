package com.legalbreeze.repository;

import com.legalbreeze.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District, Integer> {
}