package com.example.moneymanagementapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoneyManagementController {
  @GetMapping("/toppage")
  public String index(Model model) {
    String message = "トップページ";
    model.addAttribute("message", message);
    return "moneymanagement/index";
  }
}