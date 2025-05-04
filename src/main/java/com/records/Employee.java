package com.records;

import java.math.BigDecimal;

public record Employee(
        int id,
        String firstName,
        String lastName,
        BigDecimal salary,
        int age
) {
    // No additional methods or fields are needed for a record
}
