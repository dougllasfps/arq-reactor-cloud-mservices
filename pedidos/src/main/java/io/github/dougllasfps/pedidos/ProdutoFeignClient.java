package io.github.dougllasfps.pedidos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "msprodutos")
public interface ProdutoFeignClient {

    @GetMapping("/produtos")
    public String status();
}
