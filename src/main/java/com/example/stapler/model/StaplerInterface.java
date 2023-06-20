package com.example.stapler.model;

public interface StaplerInterface {
    void stapleSheets(int numSheets);

    void refillStaples(int numStaples);

    void unloadStaples();

    boolean isEmpty(int numStaples);
}
