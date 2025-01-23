package Countires;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Country> countries = new LinkedList<>();

        countries.add(ListOfCountry.Armenia);
        countries.add(ListOfCountry.Russian);
        countries.add(ListOfCountry.France);
        countries.add(ListOfCountry.Norway);
        countries.add(ListOfCountry.Norway);
        countries.add(ListOfCountry.Armenia);

        System.out.println("Before remove duplicates " + countries);

        for (int i = 0; i < countries.size(); i++) {
            for (int j = i + 1; j < countries.size(); j++) {
                if (countries.get(i).getCountryName().equals(countries.get(j).getCountryName())) {
                    countries.remove(j);
                    j--;
                }
            }
        }

        System.out.println("After removal " + countries);
    }
}
