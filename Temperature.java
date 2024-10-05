public class Temperature {
    public static void main(String[] args) {
        convertTemperature(135.0);

    }
    static double convertTemperature(double fahrenheit){
        if (fahrenheit > 134 || fahrenheit < -135.8) {
            System.out.println("Invalid temperature ");
            System.exit(1);
        }
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "F equals to " + celsius + "C");
        return celsius;
    }
    static double convertTemperature(int celsius){
        if(celsius > 57 || celsius < -93){
            System.out.println("Invalid temperature ");
            System.exit(1);
        }
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "C equals to " + fahrenheit + "F");
        return fahrenheit;
    }
}