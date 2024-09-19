package com.mendesswashington.main;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class productsCrontroller {
    @GetMapping("/")
    public String getHelloWord() {
        return "Hello World";
    }

    @GetMapping("/products")
    public String[] getProducts() {
        String[] products = { "Product1", "Product2", "Product3" };
        return products;
    }
}
