package com.dre.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Vinícius Pelizzari
 */

@SpringBootApplication
public class SoftwareDreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareDreApplication.class, args);
		System.out.println("EM EXECUÇÃO - OK!");
	}

}
