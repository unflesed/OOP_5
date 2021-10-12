package OOP_5.practice.additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Раиса Ивановна");
        arrayList.add("Алла Фёдоровна");
        arrayList.add("Василий Иванович");
        System.out.println(arrayList);
        System.out.println("Индекс самого лучшего учителя " + arrayList.indexOf("Алла Фёдоровна"));
        System.out.println("Индекс самого не очень :) " + arrayList.indexOf("Раиса Ивановна"));
    }
}
