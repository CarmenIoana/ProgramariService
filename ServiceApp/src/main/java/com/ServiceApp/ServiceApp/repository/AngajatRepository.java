package com.ServiceApp.ServiceApp.repository;

import com.ServiceApp.ServiceApp.entity.Angajat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AngajatRepository extends JpaRepository<Angajat, UUID> {

}
