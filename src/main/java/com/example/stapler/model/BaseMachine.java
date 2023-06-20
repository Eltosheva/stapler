package com.example.stapler.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
abstract class BaseMachine {
    private int serialNumber;
    private LocalDate createDate;
    private String color;
}
