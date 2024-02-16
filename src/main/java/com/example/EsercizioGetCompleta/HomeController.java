package com.example.EsercizioGetCompleta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HomeController {
    @GetMapping(path = "/ciao/{provincia}")
    public User domanda(@PathVariable String provincia, @RequestParam String nome) {
        String saluto = "Ciao " + nome + ", com'è il tempo in" + provincia + "?";
        return new User(nome,provincia,saluto);
    }
}
