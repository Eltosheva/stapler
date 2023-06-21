package com.example.stapler.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
abstract class BaseMachine {
    private final int serialNumber;
    private final LocalDate createDate;
    private final Color color;

    protected BaseMachine(int serialNumber, LocalDate createDate, Color color) {
        this.serialNumber = serialNumber;
        this.createDate = createDate != null ? createDate : LocalDate.now();
        this.color = color;
    }
}
