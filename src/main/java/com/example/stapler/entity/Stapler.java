package com.example.stapler.entity;

import com.example.stapler.StaplerInterface;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stapler extends BasicEntity implements StaplerInterface {

    private boolean isLoaded;
    private int stapleCount;
    private int capacity;

    @Override
    public void stapleSheets(int numSheets) {
        if (stapleCount >= numSheets) {
            stapleCount -= numSheets;
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
        stapleCount += numStaples;
        System.out.println("Refilled " + numStaples + " staples.");
    }

    @Override
    public void unloadStaples() {
        if (isLoaded) {
            stapleCount = 0;
            isLoaded = false;
            System.out.println("Staples unloaded.");
        } else {
            System.out.println("Stapler is already empty.");
        }
    }
}
