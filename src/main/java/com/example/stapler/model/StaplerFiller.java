package com.example.stapler.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaplerFiller {
    private int stapleAmount;
    private int stapleSize;

    boolean isEmpty() {
        return this.stapleAmount <= 0;
    }
}
