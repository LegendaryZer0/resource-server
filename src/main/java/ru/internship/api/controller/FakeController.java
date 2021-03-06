package ru.internship.api.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.internship.api.model.User;
@RequestMapping("/fake/resource")
@RestController
public class FakeController {

    @GetMapping("/getUser")
    public ResponseEntity<?> getResource() {
        return ResponseEntity.ok(User.builder().name("Пьер").surname("Кюри").id(RandomUtils.nextLong()*100).build());
    }
}
