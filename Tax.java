public class Tax {
    public static void main(String[] args) {
        calculateIncomeTax(10000, 50);
        calculateIncomeTax(10000);
        calculateIncomeTax(10000, true);

    }
    static double calculateIncomeTax(double salary){
        double tax = salary * 20 / 100;
        System.out.println(tax);
        return tax;
    }

    static  double calculateIncomeTax(double salary, double customTax){
        double tax = salary * customTax / 100;
        System.out.println(tax);
        return tax;
    }

    static double calculateIncomeTax(double salary, boolean employee){
        double tax = 20;
        if (employee){
            tax = 10;
        }
        double summary = salary * tax / 100;
        System.out.println(summary);
        return summary;
    }
}
