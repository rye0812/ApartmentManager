package com.Apartment_Management;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ApartmentManagementApplicationTests {

	@Test
	void contextLoads() {
	}

}
