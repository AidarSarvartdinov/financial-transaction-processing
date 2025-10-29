package com.transaction.dto;

import com.transaction.enums.CurrencyType;

import lombok.Data;

@Data
public class CreateAccountRequest {
    private CurrencyType currency;
}
