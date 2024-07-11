package com.ServiceApp.ServiceApp.repository;

import com.ServiceApp.ServiceApp.entity.Programare;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProgramareRepository extends JpaRepository<Programare,UUID> {
}
