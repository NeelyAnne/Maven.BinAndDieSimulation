package com.github.git_leon.dicerollsimulator;

import java.util.Arrays;

public class Bins {

    private final Bin[] binArray;

    public Bins() {
        this(2,12);
    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        int numberOfBins = (maxFaceValue - minFaceValue) + 1;
        binArray = new Bin[numberOfBins];

        for (int i = 0; i < binArray.length; i++) {
            Integer faceValueToTrack = minFaceValue + i;
            binArray[i] = new Bin(faceValueToTrack);
        }
    }

    public void incrementBin(Integer faceValueToIncrement) {
        getBin(faceValueToIncrement).increment();
    }

    public Bin getBin(Integer faceValueToIncrement) {
        for (int i = 0; i < binArray.length; i++) {
            Bin bin = binArray[i];
            int numberToTrack = bin.getFaceValueToTrack();
            if (numberToTrack == faceValueToIncrement) {
                return bin;
            }
        }
        return null;
    }

    public Bin[] getBins() {
        return binArray;
    }

    @Override
    public String toString() {
        return "Bins{" +
                "binArray=" + Arrays.toString(binArray) +
                '}';
    }
}
