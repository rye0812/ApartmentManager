package com.Apartment_Management.controller;

import com.Apartment_Management.model.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Apartment_Management.services.ResidentService;

import java.util.List;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    // Lấy danh sách tất cả cư dân
    @GetMapping
    public List<Resident> getAllResidents() {
        return residentService.getAllResidents();
    }

    // Thêm mới cư dân
    @PostMapping
    public Resident addResident(@RequestBody Resident resident) {
        return residentService.addResident(resident);
    }

    // Cập nhật thông tin cư dân
    @PutMapping("/{id}")
    public Resident updateResident(@PathVariable Long id, @RequestBody Resident resident) {
        return residentService.updateResident(id, resident);
    }

    // Xóa cư dân
    @DeleteMapping("/{id}")
    public String deleteResident(@PathVariable Long id) {
        boolean isDeleted = residentService.deleteResident(id);
        return isDeleted ? "Resident deleted successfully!" : "Resident not found!";
    }

    // Lấy thông tin cư dân theo ID
    @GetMapping("/{id}")
    public Resident getResidentById(@PathVariable Long id) {
        return residentService.getResidentById(id);
    }
}

