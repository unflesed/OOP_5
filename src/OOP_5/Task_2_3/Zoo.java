package OOP_5.Task_2_3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(8);
        arrayList.add(0,"Elephant");
        arrayList.add(1,"Lion");
        arrayList.add(2,"Crocodile");
        arrayList.add(3,"Hair");
        arrayList.add(4,"Tiger");
        arrayList.add(5,"Bear");
        arrayList.add(6,"Parrot");
        arrayList.add(7,"Ostrich");
        System.out.println(arrayList);
        arrayList.remove(6);
        arrayList.remove(4);
        arrayList.remove(2);
        System.out.println("Размер списка: " + arrayList.size());
    }
}
