package com.company;

import java.util.Arrays;

public class Farm_2 extends Farm{
    Cow[] cows;
    Horse[] horses;
    Sheep[] sheep;

    public Farm_2(String adress, String ownerName, Sheep[]sheep, Cow[]cows, Horse[]horses) {
        super(adress, ownerName);
        this.sheep=sheep;
        this.cows=cows;
        this.horses=horses;
    }

    @Override
    public String toString() {
        return "Farm_2{ daregi - " +getAdress()+", eesi - "+getOwnerName()+" "+
                "\ncows=" + Arrays.toString(cows) +
                ",\nhorses=" + Arrays.toString(horses) +
                ",\nsheep=" + Arrays.toString(sheep) +
                '}';
    }
}
