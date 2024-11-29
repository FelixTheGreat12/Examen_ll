package com.upiiz.users.controllers;


import com.upiiz.users.entities.UserEntities;
import com.upiiz.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserControllers {

    @Autowired
    private UserService userService;

    // GET todos
    @GetMapping
    public ResponseEntity<List<UserEntities>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // GET
    @GetMapping("/{id}")
    public ResponseEntity<UserEntities> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // POST
    @PostMapping
    public ResponseEntity<UserEntities> createUser(@RequestBody UserEntities user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    // PUT
    @PutMapping("/{id}")
    public ResponseEntity<UserEntities> updateUser(@PathVariable Long id, @RequestBody UserEntities user) {
        user.setUser_id(id);
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserEntities> deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

}