package Homework;
import java.util.ArrayList;
import java.util.Objects;

public class Building {
    private final int numberOfFloors;
    private final int numberOfParkingSpots;
    private final ArrayList<Apartment> apartments;

    public Building(int numberOfFloors, int numberOfParkingSpots, ArrayList<Apartment> apartments) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfParkingSpots = numberOfParkingSpots;
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return numberOfFloors == building.numberOfFloors &&
                numberOfParkingSpots == building.numberOfParkingSpots &&
                apartments.equals(building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFloors, numberOfParkingSpots, apartments);
    }

    @Override
    public String toString() {
        return "Building{" +
                "numberOfFloors=" + numberOfFloors +
                ", numberOfParkingSpots=" + numberOfParkingSpots +
                ", apartments=" + apartments +
                '}';
    }
}
