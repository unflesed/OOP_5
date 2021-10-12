package OOP_5.practice.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        System.out.println("Введите 5 чисел:");
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        System.out.println("1. Добавить элемент в список;\n" +
                "2. Удалить элемент из списка;\n" +
                "3. Показать содержимое списка;\n" +
                "4. Проверить есть ли значение в списке;\n" +
                "5. Заменить значение в списке.");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Введите число для добавления:");
                arrayList.add(sc.nextInt());
                break;
            case 2:
                System.out.println("Введите индекс элемента, который желаете удалить.");
                arrayList.remove(sc.nextInt());
                break;
            case 3:
                System.out.println(arrayList);
                break;
            case 4:
                System.out.println("Введите число для проверки наличия в списке:");
                System.out.println(arrayList.contains(((Integer) sc.nextInt())));
                break;
            case 5:
                System.out.println("Введите индекс элемента который необходимо заменить и новое значение:");
                int index = sc.nextInt();
                int value = sc.nextInt();
                if (index > 0 && index < arrayList.size()) {
                    arrayList.set(index, value);
                }else {
                    System.out.println("Вы выщли за границы массива!");
                }
                break;
        }
    }
}
