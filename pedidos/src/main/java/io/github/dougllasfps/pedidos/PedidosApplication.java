package io.github.dougllasfps.pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class PedidosApplication {

	@Autowired
	private ProdutoFeignClient produtoClient;

	@GetMapping("/pedidos")
	public String status(){
		return "OK";
	}

	@GetMapping("/pedidos/produtos")
	public String statusProdutos(){
		String status = produtoClient.status();
		return "Status Produto: " + status;
	}

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

}
