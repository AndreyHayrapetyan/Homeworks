package New3D;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Map<Dot3D, String> pointCreate = new HashMap<>();

        pointCreate.put(new Dot3D(1.0, 2.0, 3.0, "Red", "A"), "Armen");
        pointCreate.put(new Dot3D(1.0, 2.0, 3.0, "Red", "B"), "Arbi");
        pointCreate.put(new Dot3D(4.0, 5.0, 6.0, "Blue", "C"), "Karlen");
        pointCreate.put(new Dot3D(7.0, 8.0, 9.0, "Green", "D"), "Gago");

        TreeMap<Dot3D, String> sortedPoint = new TreeMap<>(pointCreate);

        System.out.println("TreeMap:");
        for (Map.Entry<Dot3D, String> entry : sortedPoint.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println("\nTreeMap contains all HashMap elements: " +
                (sortedPoint.size() == pointCreate.size()));
    }
}
