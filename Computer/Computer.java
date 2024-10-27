package Computer;

public class Computer {
    private static int idCounter = 1;
    private int id;
    private int ram;
    private int storage;
    private String cpu;
    private static final int Max_Storage = 2048;
    private static final int Max_Ram = 64;

    public Computer(){
        this.id = idCounter;
        ram = 8;
        storage = 512;
        cpu = "Intel Core I5";
        idCounter++;
    }

    public Computer(int ram, int storage, String cpu){
        this.id = idCounter;
        if(ram > Max_Ram){
            this.ram = Max_Ram;
        } else {
            this.ram = ram;
        }

        if(storage > Max_Storage){
            this.storage = Max_Storage;
        } else {
            this.storage = storage;
        }
        this.cpu = cpu;
        idCounter++;
    }

    public static Computer generateMegaComputer(){
        Computer megacomputer = new Computer();
        megacomputer.id = idCounter;
        megacomputer.idCounter++;
        megacomputer.cpu = "Intel Core I9";
        megacomputer.ram = 512;
        megacomputer.storage = 10000;
        return megacomputer;
    }

    public String getCpu(){
        return this.cpu;
    }

    public int getStorage(){
        return this.storage;
    }

    public int getRam(){
        return this.ram;
    }

    public int getId() {
        return this.id;
    }
}
