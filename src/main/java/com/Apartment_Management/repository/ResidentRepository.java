package com.Apartment_Management.repository;

import com.Apartment_Management.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Long> {
    List<Resident> findByHouseholdId(Long householdId);
    Resident findByIdCard(String idCard);
}
