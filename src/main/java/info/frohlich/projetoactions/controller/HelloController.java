package info.frohlich.projetoactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Olá Mundo";
    }
    @GetMapping("/testando")
    public String testando() {
        return "Subindo um projeto para testar o github actions";
    }

    @GetMapping("/ricardo")
    public String ricardo() {
        return "Ricardo Frohlich da Silva que está muito feliz pelo trimestre com vocês";
    }
}