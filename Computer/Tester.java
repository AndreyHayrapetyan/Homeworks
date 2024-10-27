package Computer;

public class Tester {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer1 = new Computer(65, 124, "Intel");
        Computer computer2 = Computer.generateMegaComputer();
        System.out.println(computer.getId());
        System.out.println(computer1.getId() +" " + " "+ computer1.getRam()+" " + " " + computer1.getStorage() + " " +" "+ computer1.getCpu());
        System.out.println(computer2.getId() +" " + " "+ computer2.getRam()+" " + " " + computer2.getStorage() + " " +" "+ computer2.getCpu());
    }
}
