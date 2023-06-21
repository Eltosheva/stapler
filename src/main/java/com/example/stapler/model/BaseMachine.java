package com.example.stapler.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
abstract class BaseMachine {
    private final int serialNumber;
    private final LocalDate createDate;
    private final String color;

    BaseMachine(int serialNumber, LocalDate createDate, String color) {
        this.serialNumber = serialNumber;
        this.createDate = createDate;
        this.color = color;
    }
}
