package Homework;

import java.util.ArrayList;
import java.util.Objects;

public class Complex {
    private final ArrayList<Building> buildings;

    public Complex(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }


    public ArrayList<Building> getBuildings() {
        return buildings;
    }





    @Override
    public String toString() {
        return "Complex{" +
                ", buildings=" + buildings +
                '}';
    }
}

