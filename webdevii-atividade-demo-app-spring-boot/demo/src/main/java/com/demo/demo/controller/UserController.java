package com.demo.demo.controller;

import com.demo.demo.model.User;
import com.demo.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        return userService.createUser(username);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody Map<String, String> body) {
        String newUsername = body.get("username");
        var updated = userService.updateUser(id, newUsername);
        if (updated.isPresent()) {
            return ResponseEntity.ok(updated.get());
        } else {
            return ResponseEntity.status(404)
                    .body(Map.of(
                            "status", "NOT_FOUND",
                            "errorMessage", "usuário não encontrado"
                    ));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        boolean deleted = userService.deleteUser(id);
        if (deleted) {
            return ResponseEntity.ok(Map.of("status", "OK"));
        } else {
            return ResponseEntity.status(404)
                    .body(Map.of(
                            "status", "NOT_FOUND",
                            "errorMessage", "usuário não encontrado"
                    ));
        }
    }
}
