package com.example.demo.controller;

import com.example.demo.dto.CricketMatch;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

  @PostMapping("/matches")
  public void create(@RequestBody @Valid CricketMatch cricketMatch) {
    System.out.println(cricketMatch);
  }

}
