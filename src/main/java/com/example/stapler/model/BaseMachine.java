package com.example.stapler.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
abstract class BaseMachine {
    private int serialNumber;
    LocalDate createDate;
    String color;
}
