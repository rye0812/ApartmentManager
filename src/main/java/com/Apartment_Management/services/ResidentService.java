package com.Apartment_Management.services;

import com.Apartment_Management.Repo.ResidentRepository;
import com.Apartment_Management.model.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResidentService {

    private final ResidentRepository residentRepository;

    public ResidentService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    // Lấy danh sách tất cả cư dân
    public List<Resident> getAllResidents() {
        return residentRepository.findAll();
    }

    // Thêm mới cư dân
    public Resident addResident(Resident resident) {
        return residentRepository.save(resident);
    }

    // Cập nhật thông tin cư dân
    public Resident updateResident(Long residentId, Resident updatedResident) {
        Optional<Resident> existingResident = residentRepository.findById(residentId);
        if (existingResident.isPresent()) {
            Resident resident = existingResident.get();
            resident.setName(updatedResident.getName());
            resident.setDateOfBirth(updatedResident.getDateOfBirth());
            resident.setIdCard(updatedResident.getIdCard());
            resident.setTemporary(updatedResident.isTemporary());
            resident.setHouseholdId(updatedResident.getHouseholdId());
            return residentRepository.save(resident);
        }
        return null;
    }

    // Xóa cư dân
    public boolean deleteResident(Long residentId) {
        if (residentRepository.existsById(residentId)) {
            residentRepository.deleteById(residentId);
            return true;
        }
        return false;
    }

    // Lấy cư dân theo ID
    public Resident getResidentById(Long residentId) {
        return residentRepository.findById(residentId).orElse(null);
    }
}

