package io.github.dougllasfps.mseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MseurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MseurekaApplication.class, args);
	}

}
