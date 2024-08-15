package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private List<User> users = new ArrayList<>();

  @PostMapping("/api/createUser")
  public List<User> createUser(@RequestBody List<User> users) {
    this.users.add(users.get(0));
    return users;
  }

  @GetMapping("/api/getUsers")
  public List<User> getUsers() {
    return users;
  }
}
