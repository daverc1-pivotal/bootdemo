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

    @RequestMapping("/time")
    public String showTime() {

        return "Using new Buildpack.\n Java Version "+System.getProperty("java.version")+"\n"+
                "Deployment Time Stamp "+System.getProperty("staging.timestamp");
    }

    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }
}
