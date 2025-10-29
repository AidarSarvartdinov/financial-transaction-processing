package com.transaction.service;

import com.transaction.dto.CreateAccountRequest;

public interface AccountService {
    void createAccount(CreateAccountRequest accountDto);
}
