package me.loki2302;

import lombok.Generated;
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
    @Generated // a bad idea, but seems to be the only way to exclude a single method (as of 0.8.0)
    public String endpoint1() {
        return "hello";
    }

    @RequestMapping("endpoint2")
    public String endpoint2() {
        return "world";
    }
}
