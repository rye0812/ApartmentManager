package com.Apartment_Management.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "resident")
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resident_id")
    private Long residentId;

    @Column(name = "household_id", nullable = false)
    private Long householdId;

    @Column(nullable = false)
    private String name;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "id_card", nullable = false, unique = true)
    private String idCard;

    @Column(nullable = false)
    private boolean temporary;
}

