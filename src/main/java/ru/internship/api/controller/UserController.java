package ru.internship.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.internship.api.model.UserDto;
import ru.internship.api.service.UserService;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getAll")
    public List<UserDto> getUsers(){
        List<UserDto> dtoList=userService.getAllUsers();
        log.info("list of all userDto to sending  {}",dtoList.toString());
        return dtoList;
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
        return ResponseEntity.ok("OK");
    }
}
