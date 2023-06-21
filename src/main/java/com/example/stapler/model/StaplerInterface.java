package com.example.stapler.model;

public interface StaplerInterface {
    void staplerPushes(int numPushes);

    void refillStaples(StaplerFiller staplerFiller);

    StaplerFiller unloadStaples();

    boolean isEmpty();
}
