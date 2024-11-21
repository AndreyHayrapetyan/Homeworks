package Animals;

public class Monkey implements Animal, PerformTrick{
    private String name;
    private int age;

    Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Monkey " + name + " is making sound ");
    }

    public void eat() {
        System.out.println("Monkey " + name + " is eating");
    }

    public void performTrick() {
        System.out.println("Monkey " + name + " is making a trick");
    }
}
