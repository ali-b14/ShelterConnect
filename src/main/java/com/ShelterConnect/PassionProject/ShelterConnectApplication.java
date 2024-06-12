package com.ShelterConnect.PassionProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLOutput;

@SpringBootApplication
//@ComponentScan
//@Configuration
//@AutoConfiguration
public class ShelterConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShelterConnectApplication.class, args);
	}

}
