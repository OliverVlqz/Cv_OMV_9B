package mx.edu.utez.cvomv9b.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/user2")
public class user2controller {
    @GetMapping("/")
    public String Message(){
        return "Hola desde user2 controller";
    }
}
