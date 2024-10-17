public class Home {
    double livingRoom;
    double kitchen;
    double bedroom;
    double bathroom;

    public Home(double l, double k, double bed, double bath){
        if(l <= 0 || k <= 0 || bed <= 0 || bath <= 0){
            System.out.println("Invalid room size");
            System.exit(1);
        }
        livingRoom = l;
        kitchen = k;
        bedroom = bed;
        bathroom = bath;
    }

    public Home(double l, double k, double bed){
        if(l <= 0 || k <= 0 || bed <= 0){
            System.out.println("Invalid room size");
            System.exit(1);
        }
        livingRoom = l;
        kitchen = k;
        bedroom = bed;
        bathroom = 7.0;
    }

    public void roomsize(){
        System.out.println("Living Room is " + livingRoom + "m^2");
        System.out.println("Kitchen is " + kitchen + "m^2");
        System.out.println("Bedroom is " + bedroom + "m^2");
        System.out.println("Bathroom is " + bathroom + "m^2");
    }

    public static void main(String[] args) {
        Home home1 = new Home(40, 23, 56, 15);
        home1.roomsize();

        Home home2 = new Home(23, 56,21);
        home2.roomsize();
    }
}
