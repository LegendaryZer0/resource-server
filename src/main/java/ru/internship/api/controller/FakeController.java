package ru.internship.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.internship.api.model.User;

@RestController
@Slf4j
@RequestMapping("/user")
@RefreshScope
public class FakeController {

  @Value("${test.example}")
  private String exampleFromCloud;

  @GetMapping("/{id}")
  public ResponseEntity<?> getResource(@PathVariable Integer id) {
    log.info("Upload info");
    return ResponseEntity.ok(
        User.builder().name("Пьер").surname("Кюри").id(RandomUtils.nextLong() * 100).build());
  }

  @GetMapping("/cloud")
  public ResponseEntity<?> getResourceCloud() {
    log.info("Cloud info");
    return ResponseEntity.ok(exampleFromCloud);
  }
}
