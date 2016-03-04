package com.fetme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@EnableAutoConfiguration
@RestController

public class BootdemoApplication {

    @RequestMapping("/")
    public String sayHello(){
        Logger.getGlobal().info("Handling request...");
        return "Hello World, I'm a simple Spring Boot App\n";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "Hello "+name+", I'm a simple Spring Boot App\n";
    }

    @RequestMapping("/save")
    public String save(@RequestParam(value="Person", required=false, defaultValue="Carl") String name, Model person) {
        person.addAttribute("name", name);
        return "Hello "+name+", I'm am saving you in my contacts\n";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }
}
