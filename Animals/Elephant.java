package Animals;

public class Elephant implements Animal, PerformTrick{
    private String name;
    private int age;

    Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void makeSound() {
        System.out.println("Elephant " + name + " is making sound");
    }


    public void eat() {
        System.out.println("Elephant " + name + " is eating");
    }


    public void performTrick() {
        System.out.println("Elephant " + name + " is making a trick");
    }
}
