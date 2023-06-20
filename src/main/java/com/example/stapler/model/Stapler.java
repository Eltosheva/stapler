package com.example.stapler.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stapler extends BaseMachine implements StaplerInterface {
    private boolean isLoaded;
    private StaplerFiller staplerFiller;
    private int capacity;

    @Override
    public void stapleSheets(int numSheets) {
        if (staplerFiller.getStapleCount() >= numSheets) {
            staplerFiller.setStapleCount(staplerFiller.getStapleCount() - numSheets);
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
        staplerFiller.setStapleCount(staplerFiller.getStapleCount() + numStaples);
        isLoaded = true;
        System.out.println("Refilled " + numStaples + " staples.");
    }

    @Override
    public void unloadStaples() {
        if (isLoaded) {
            staplerFiller.setStapleCount(0);
            isLoaded = false;
            System.out.println("Staples unloaded.");
        } else {
            System.out.println("Stapler is already empty.");
        }
    }

    @Override
    public boolean isEmpty() {
        return staplerFiller.getStapleCount() <= 0;
    }
}
