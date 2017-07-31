package test.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import test.spring.service.DBService;


@AutoConfigureAfter(DBService.class)
@SpringBootApplication
@EnableScheduling
public class Main {

    public static void main(String[] args) {
        System.setProperty("developer", "Leonid Semerenko");
        SpringApplication.run(Main.class);
    }
}
