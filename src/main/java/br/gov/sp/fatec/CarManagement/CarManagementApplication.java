package br.gov.sp.fatec.CarManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;

@SpringBootApplication
public class CarManagementApplication {
	private static void connect() {
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")) {
			System.out.println("Connection established successfully!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(CarManagementApplication.class, args);
	}

}
