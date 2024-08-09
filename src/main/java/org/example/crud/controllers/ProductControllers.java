package org.example.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductControllers {

    @GetMapping
    public ResponseEntity findAllProduct() {
        return ResponseEntity.ok().body("Deu tudo certo !");
    }

}
