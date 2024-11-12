package com.Apartment_Management;

import org.springframework.boot.SpringApplication;

public class TestApartmentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApartmentManagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
