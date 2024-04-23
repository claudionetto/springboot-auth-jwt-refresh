package com.claudionetto.jwtouath2;

import com.claudionetto.jwtouath2.config.userConfig.RSAKeyRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RSAKeyRecord.class)
@SpringBootApplication
public class JwtOuath2Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtOuath2Application.class, args);
	}

}
