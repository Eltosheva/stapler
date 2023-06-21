package com.example.stapler.model;

public interface Stapler {
    void staplerPushes(int numPushes);

    void refillStaples(StaplerFiller staplerFiller);

    StaplerFiller unloadStaples();

    boolean isEmpty();
}
