package au.com.odecee.sync.devops.cd4ecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hello, %s!", name == null ? name : "there");
    }
}
