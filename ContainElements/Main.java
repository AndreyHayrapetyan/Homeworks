package ContainElements;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Integer targetNumber = 20;
        boolean foundNumber = containsElement(numbers, targetNumber);
        System.out.println("Number found: " + foundNumber);

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        String targetWord = "banana";
        boolean foundWord = containsElement(words, targetWord);
        System.out.println("Word found: " + foundWord);
    }

    public static <T> boolean containsElement(ArrayList<T> list, T element) {
        return list.contains(element);
    }
}

