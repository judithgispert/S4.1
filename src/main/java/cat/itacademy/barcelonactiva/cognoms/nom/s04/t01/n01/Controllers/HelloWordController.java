package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWordController {
    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hello, " + name + ". You're running a Maven project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name){
        if (name != null){
            return "Hello, " + name + ". You're running a Maven project.";
        } else {
            return "Name missing.";
        }
    }
}
