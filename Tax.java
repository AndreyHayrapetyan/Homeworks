public class Tax {
    public static void main(String[] args) {
        calculateIncomeTax(5000, true);
        calculateIncomeTax(5000, 20);
        calculateIncomeTax(5000);


    }

    static double calculateIncomeTax(double salary) {
        if (salary <= 0) {
            System.out.println("Invalid Salary");
            System.exit(1);
        }
        double tax = salary * 20 / 100;
        System.out.println(tax);
        return tax;
    }

    static double calculateIncomeTax(double salary, double customTax) {

        if (salary <= 0 || customTax <= 0) {
            System.out.println("Invalid Data");
            System.exit(1);
        }
        double tax = salary * customTax / 100;
        System.out.println(tax);
        return tax;
    }


    static double calculateIncomeTax(double salary, boolean employee) {
        if (salary <= 0){
            System.out.println("Invalid Salary");
            System.exit(1);
        }
        double tax = 20;
        if (employee) {
            tax = 10;
        }
        double summary = salary * tax / 100;
        System.out.println(summary);
        return summary;
    }
}

