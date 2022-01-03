package io.github.dougllasfps.produtos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Slf4j
public class ProdutosApplication {

	@Autowired
	private Environment env;

	@GetMapping("/produtos")
	public String status(){
		var port = env.getProperty("local.server.port");
		log.info("Receiving requests on port {}", port);
		return "OK";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

}
