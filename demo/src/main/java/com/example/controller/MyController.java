package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class MyController {

    private final int secretNumber;

    public MyController() {
        // Genera un número aleatorio entre 1 y 10 al iniciar la API
        this.secretNumber = new Random().nextInt(10) + 1;
    }

    @GetMapping("/guess")
    public String guessNumber(@RequestParam int number) {
        if (number < 1 || number > 10) {
            return "❌ Elige un número entre 1 y 10.";
        }

        if (number < secretNumber) {
            return "🔼 El número secreto es mayor.";
        } else if (number > secretNumber) {
            return "🔽 El número secreto es menor.";
        } else {
            return "🎉 ¡Felicitaciones! Adivinaste el número secreto.";
        }
    }
}
