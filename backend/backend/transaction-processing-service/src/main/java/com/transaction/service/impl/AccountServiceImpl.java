package com.transaction.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.transaction.dto.CreateAccountRequest;
import com.transaction.model.Account;
import com.transaction.model.enums.AccountStatus;
import com.transaction.repository.AccountRepo;
import com.transaction.service.AccountService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepo accountRepo;

    public void createAccount(CreateAccountRequest accountDto) {
        Account account = Account.builder()
        .balance(BigDecimal.ZERO)
        .accountNumber(Long.toString(new Random().nextLong()))
        .currency(accountDto.getCurrency())
        .openedData(LocalDate.now())
        .status(AccountStatus.ACTIVE)
        .build();
        accountRepo.save(account);
    }

    

}
