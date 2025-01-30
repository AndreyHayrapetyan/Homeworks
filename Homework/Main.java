package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static String getAddress(HashMap<Complex, String> complexMap, Complex complex) throws ComplexNotFoundException {
        if (!complexMap.containsKey(complex)) throw new ComplexNotFoundException("Complex is not found");
        return "Complex found with ID:" + complexMap.get(complex);
    }

    public static void main(String[] args) {

        Apartment apartment1 = new Apartment(3, 120.5, true, 19);
        Apartment apartment2 = new Apartment(1, 24.6, false, 3);
        Apartment apartment3 = new Apartment(4, 152.8, true, 18);
        Apartment apartment4 = new Apartment(2, 32.5, true, 4);



        try {
            Building building1 = new Building(2, 0, new ArrayList<>(List.of(apartment1, apartment2)));
            Building building2 = new Building(3, 5, new ArrayList<>(List.of(apartment3, apartment4)));
            Complex complex = new Complex(new ArrayList<>(List.of(building1, building2)));
            HashMap<Complex, String> complexesMap = new HashMap<>();
            complexesMap.put(complex, "Syunik 27");
            System.out.println(getAddress(complexesMap, complex));
        } catch (ComplexNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
