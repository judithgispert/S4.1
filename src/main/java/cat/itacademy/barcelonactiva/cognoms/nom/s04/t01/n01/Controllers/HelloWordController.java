package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloWordController {
    @GetMapping("/HelloWord")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hello, " + name + ". You're running a Maven project.";
    }

    @GetMapping({"/HelloWord2", "/HelloWord2/{name}"})
    public String greet2(@PathVariable(required = false) String name){
        if (name != null){
            return "Hello, " + name + ". You're running a Maven project.";
        } else {
            return "Name missing.";
        }
    }
}
