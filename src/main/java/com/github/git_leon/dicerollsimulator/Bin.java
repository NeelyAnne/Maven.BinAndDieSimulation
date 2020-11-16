package com.github.git_leon.dicerollsimulator;

public class Bin {
    private final Integer faceValueToTrack;
    private Integer numberOfOccurences;

    public Bin(Integer faceValueToTrack) {
        this(faceValueToTrack,0);
    }

    Bin(Integer faceValueToTrack, Integer numberOfOccurrences) {
        this.faceValueToTrack = faceValueToTrack;
        this.numberOfOccurences = numberOfOccurrences;
    }

    public Integer getFaceValueToTrack() {
        return faceValueToTrack;
    }

    public Integer getNumberOfOccurrences() {
        return numberOfOccurences;
    }

    public void increment() {
        numberOfOccurences++;
    }

    @Override
    public String toString() {
        return "Bin{" +
                "faceValueToTrack=" + faceValueToTrack +
                ", numberOfOccurences=" + numberOfOccurences +
                '}';
    }
}
