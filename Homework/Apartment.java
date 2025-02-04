package Homework;

import java.util.Objects;

public class Apartment {
    int rooms;
    double squareMeters;
    boolean hasBalcony;
    int floor;

    public Apartment(int rooms, double squareMeters, boolean hasBalcony, int floor) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.hasBalcony = hasBalcony;
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return rooms == apartment.rooms &&
                Double.compare(apartment.squareMeters, squareMeters) == 0 &&
                hasBalcony == apartment.hasBalcony &&
                floor == apartment.floor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, squareMeters, hasBalcony, floor);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "rooms=" + rooms +
                ", squareMeters=" + squareMeters +
                ", hasBalcony=" + hasBalcony +
                ", floor=" + floor +
                '}';
    }
}