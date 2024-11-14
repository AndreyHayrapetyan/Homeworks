package Animals;

public class Lion implements Animal{
    private String name;
    private int age;

    Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Lion " + name + " is making sound");
    }

    public void eat() {
        System.out.println("Lion " + name + " is eating");
    }
}
