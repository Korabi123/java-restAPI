package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/api/addNumbers")
    public @ResponseBody String hello(@RequestParam("firstNum") int firstNumber, @RequestParam("secondNum") int secondNumber) {
      return String.format("The sum of %s and %s is %s", firstNumber, secondNumber, firstNumber + secondNumber);
    }
}
