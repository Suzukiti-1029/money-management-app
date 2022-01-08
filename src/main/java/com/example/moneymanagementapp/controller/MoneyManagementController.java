package com.example.moneymanagementapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoneyManagementController {
  @GetMapping("/toppage")
  public String index() {
    return "index";
  }
}
