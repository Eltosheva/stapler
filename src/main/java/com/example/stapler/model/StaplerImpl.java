package com.example.stapler.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StaplerImpl extends BaseMachine implements Stapler {
    private final StaplerFiller staplerFiller;
    private final int capacity;
    private final int requiredSize;

    public StaplerImpl(StaplerFiller staplerFiller, int capacity, int serialNumber, LocalDate createDate, Color color, int requiredSize) {
        super(serialNumber, createDate, color);
        this.staplerFiller = staplerFiller != null ? staplerFiller : new StaplerFiller();
        this.capacity = capacity;
        this.requiredSize = requiredSize;
    }

    @Override
    public void staplerPushes(int numPushes) {
        if (staplerFiller.getStapleAmount() >= numPushes) {
            staplerFiller.setStapleAmount(staplerFiller.getStapleAmount() - numPushes);
            System.out.println(numPushes + " pushes made.");
        } else {
            System.out.println("Insufficient staples. Please refill.");
        }
    }

    @Override
    public void refillStaples(StaplerFiller staplerFiller) {
        if (staplerFiller.getStapleSize() != this.staplerFiller.getStapleSize()) {
            throw new IllegalArgumentException("You tried to use wrong filler size. Refill is failed.");
        }
        if (staplerFiller.getStapleAmount() > capacity) {
            System.out.println("Уou have placed too many staples. Capacity is "
                    + capacity + ". Refill is failed.");
            return;
        }
        this.staplerFiller.setStapleAmount(staplerFiller.getStapleAmount());
        System.out.println("Refilled " + staplerFiller + " staples.");
    }

    @Override
    public StaplerFiller unloadStaples() {
        if (!isEmpty()) {
            StaplerFiller unloadedFiller =
                    new StaplerFiller(this.staplerFiller.getStapleAmount(), this.staplerFiller.getStapleSize());
            staplerFiller.setStapleAmount(0);
            System.out.println("Staples unloaded.");
            return unloadedFiller;
        } else {
            System.out.println("Stapler is already empty.");
            return staplerFiller;
        }
    }

    @Override
    public boolean isEmpty() {
        return staplerFiller.isEmpty();
    }
}
