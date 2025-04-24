package com.kotari;

import java.math.BigDecimal;

public record Employee(Integer id, String firstName, String lastName, BigDecimal salary, Integer age) {

}
