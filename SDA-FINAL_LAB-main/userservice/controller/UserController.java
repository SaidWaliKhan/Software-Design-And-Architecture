package com.example.userservice.controller;
import java.util.Map;
import java.util.HashMap;
import com.example.userservice.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
private Map<String, User> users = new HashMap<String, User>();

    @PostMapping("/create")
    public String createUser(@RequestParam String userID, @RequestParam String name, @RequestParam String email) {
        User user = new User(userID, name, email);
        users.put(userID, user);
        return "User " + name + " created successfully!";
    }

    @PostMapping("/{userID}/update-location")
    public ResponseEntity<String> updateLocation(@PathVariable String userID, @RequestParam double latitude, @RequestParam double longitude) {
        User user = users.get(userID);
        if (user != null) {
            user.setLocation(latitude, longitude);
            return ResponseEntity.ok("Location updated: " + user.getLocation());
        }
        return ResponseEntity.status(404).body("User not found!");
    }

    @GetMapping("/{userID}/location")
    public ResponseEntity<String> getLocation(@PathVariable String userID) {
        User user = users.get(userID);
        if (user != null) {
            return ResponseEntity.ok(user.getLocation());
        }
        return ResponseEntity.status(404).body("User not found!");
    }
}
