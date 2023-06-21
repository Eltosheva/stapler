package com.example.stapler.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Stapler extends BaseMachine implements StaplerInterface {
    private StaplerFiller staplerFiller;
    private int capacity;

    public Stapler(StaplerFiller staplerFiller, int capacity, int serialNumber, LocalDate createDate, String color) {
        super(serialNumber, createDate, color);
        this.staplerFiller = staplerFiller;
        this.capacity = capacity;
    }

    @Override
    public void stapleSheets(int numSheets) {
        if (staplerFiller.getStapleAmount() >= numSheets) {
            staplerFiller.setStapleAmount(staplerFiller.getStapleAmount() - numSheets);
            System.out.println("Stapled " + numSheets + " sheets.");
        } else {
            System.out.println("Insufficient staples. Please refill.");
        }
    }

    @Override
    public void refillStaples(int numStaples) {
        if (numStaples > capacity) {
            System.out.println("Уou have placed too many staples. Capacity is "
                    + capacity + ". Refill is failed.");
            return;
        }
        staplerFiller.setStapleAmount(staplerFiller.getStapleAmount() + numStaples);
        System.out.println("Refilled " + numStaples + " staples.");
    }

    @Override
    public StaplerFiller unloadStaples() {
        StaplerFiller staplerFiller = this.getStaplerFiller();
        if (isEmpty()) {
            staplerFiller.setStapleAmount(0);
            System.out.println("Staples unloaded.");
        } else {
            System.out.println("Stapler is already empty.");
        }
        return staplerFiller;
    }

    @Override
    public boolean isEmpty() {
        return staplerFiller.isEmpty();
    }
}
