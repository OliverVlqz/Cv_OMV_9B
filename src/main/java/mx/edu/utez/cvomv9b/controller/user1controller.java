package mx.edu.utez.cvomv9b.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api/user1")
@CrossOrigin(origins = "*")
public class user1controller {
    @GetMapping("")
    public String getMessage() {
        return "Hola desde user1";
    }

}
