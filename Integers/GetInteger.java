package Integers;

import java.util.ArrayList;

public class GetInteger {
    public static void main(String[] args) {
        ArrayList<Number> arrayList1 = new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add(6.2);
        arrayList1.add(7.8);
        arrayList1.add(2.6);
        arrayList1.add(24);
        ArrayList<Number> arrayList2 = new ArrayList<>();
        for (Number num : arrayList1) {
            if (num.getClass() == Integer.class) {
                arrayList2.add(num);
            }
        }
        System.out.println(arrayList2);
    }
}
