package com.transaction.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.dto.CreateAccountRequest;
import com.transaction.service.AccountService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/accounts")
    public ResponseEntity<String> createAccount(@RequestBody CreateAccountRequest accountDto) {
        accountService.createAccount(accountDto);
        return ResponseEntity.status(201).body("Account created");
    }
}
