package test.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) {
        System.setProperty("developer", "Leonid Semerenko");
        SpringApplication.run(Main.class);
    }
}
