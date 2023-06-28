package com.example.mobilityfordev.repository;

import com.example.mobilityfordev.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
