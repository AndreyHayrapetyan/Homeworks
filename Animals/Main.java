package Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Afeaave", 5),
                new Elephant("Asvsfv", 8),
                new Monkey("Momo", 3),
                new Lion("Simba", 4),
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof PerformTrick) {
                ((PerformTrick) animal).performTrick();
            }

            System.out.println();
        }
    }
}
