package com.example.stapler.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaplerFiller {
    private int stapleAmount;
    private int stapleSize;

    boolean isEmpty() {
        return this.stapleAmount <= 0;
    }
}
