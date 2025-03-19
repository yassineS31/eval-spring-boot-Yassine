package com.example.evalspring;

import com.example.evalspring.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvalspringApplication  implements CommandLineRunner {

    @Autowired
    private ProduitService produitService;
    public static void main(String[] args) {

        SpringApplication.run(EvalspringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(produitService.getClass());
    }
}
