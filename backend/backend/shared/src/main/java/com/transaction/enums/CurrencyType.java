package com.transaction.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CurrencyType {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR");

    private String code;

    CurrencyType(String code) {
        this.code = code;
    }

    public static boolean isValid(String type) {
        return Arrays.stream(values())
        .anyMatch(currency -> currency.code.equalsIgnoreCase(type));
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }

    @JsonCreator
    public static CurrencyType fromCode(String code) {
        return Arrays.stream(values())
        .filter(currency -> currency.code.equalsIgnoreCase(code))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Unknown currency: " + code));
    }
}
