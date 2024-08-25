package com.example.estudo_java17.controller;

import com.example.estudo_java17.service.ITestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

  private final ITestService testService;

  public TestController(ITestService testService) {
    this.testService = testService;
  }

  @GetMapping()
  public ResponseEntity<Object> test() {
    testService.test();
    return ResponseEntity.noContent().build();
  }
}
