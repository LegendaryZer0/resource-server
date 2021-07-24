package ru.internship.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.internship.api.model.UserDto;
import ru.internship.api.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveUser(UserDto userDto){
        userService.saveUser(userDto);
        return ResponseEntity.ok("OK");
    }
}
