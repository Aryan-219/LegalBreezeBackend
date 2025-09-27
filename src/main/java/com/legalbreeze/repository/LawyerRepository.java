package com.legalbreeze.repository;

import com.legalbreeze.entity.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawyerRepository extends JpaRepository<Lawyer, Integer> {
}