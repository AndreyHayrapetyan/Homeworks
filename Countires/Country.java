package Countires;

public class Country {

    private String countryName;
    private String anthem;
    private double area;
    private long population;
    private String capital;

    Country(String countryName, String anthem, double area, long population, String capital){
        this.anthem = anthem;
        this.countryName = countryName;
        this.area = area;
        this.population = population;
        this.capital = capital;
    }

    public String getCountryName(){
        return countryName;
    }

    public String toString(){
        return " " + countryName + " " + anthem + " " + area +
                " " + population + " "  + capital;
    }
}
