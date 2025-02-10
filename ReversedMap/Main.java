package ReversedMap;

import New3D.Dot3D;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Dot3D, String> pointCreate = new HashMap<>();

        pointCreate.put(new Dot3D(1.0, 2.0, 3.0, "Red", "A"), "Alice");
        pointCreate.put(new Dot3D(1.0, 2.0, 3.0, "Red", "B"), "Alice");
        pointCreate.put(new Dot3D(4.0, 5.0, 6.0, "Blue", "C"), "Bob");
        pointCreate.put(new Dot3D(7.0, 8.0, 9.0, "Green", "D"), "Charlie");

        TreeMap<Dot3D, String> sortedPoint = new TreeMap<>(pointCreate);

        Map<String, Dot3D> reversedHashMap = reverseMap(pointCreate);
        Map<String, Dot3D> reversedTreeMap = reverseMap(sortedPoint);

        System.out.println("Reversed HashMap:");
        for (Map.Entry<String, Dot3D> entry : reversedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nReversed TreeMap:");
        for (Map.Entry<String, Dot3D> entry : reversedTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nReversed HashMap equals Reversed TreeMap? " + reversedHashMap.equals(reversedTreeMap));
    }

    public static <K, V> Map<V, K> reverseMap(Map<K, V> originalMap) {
        Map<V, K> reversedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }
}
