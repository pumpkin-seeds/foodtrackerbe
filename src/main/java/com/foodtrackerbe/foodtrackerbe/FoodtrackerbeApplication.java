package com.foodtrackerbe.foodtrackerbe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class FoodtrackerbeApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(FoodtrackerbeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		runJdbc();
	}

	void runJdbc() {
		// jdbcTemplate.execute("CREATE TABLE dbo.FoodInfo2(FdcId int NULL)");
		// jdbcTemplate.execute("DROP TABLE dbo.FoodInfo2");
	}

}
