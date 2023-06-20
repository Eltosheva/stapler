package com.example.stapler.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
abstract class OfficeMachine {
    private int id;
    LocalDate createDate;
    String color;
}
