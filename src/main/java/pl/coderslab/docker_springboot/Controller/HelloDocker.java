package pl.coderslab.docker_springboot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {


    @GetMapping("/")
    public String hello(){
        return "Hello Docker!";
    }
}
