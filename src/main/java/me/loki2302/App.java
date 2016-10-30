package me.loki2302;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        new Scanner(System.in).nextLine();
        context.close();
    }

    @RequestMapping("endpoint1")
    public String endpoint1() {
        return "hello";
    }

    @RequestMapping("endpoint2")
    public String endpoint2() {
        return "world";
    }
}
