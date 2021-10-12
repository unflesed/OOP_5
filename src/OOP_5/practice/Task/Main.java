package OOP_5.practice.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        System.out.println("Введите 5 чисел:");
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        do {
            System.out.println("1. Добавить элемент в список;\n" +
                    "2. Удалить элемент из списка;\n" +
                    "3. Показать содержимое списка;\n" +
                    "4. Проверить есть ли значение в списке;\n" +
                    "5. Заменить значение в списке.\n" +
                    "6. Для выхода.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите число для добавления:");
                    arrayList.add(sc.nextInt());
                    System.out.println(arrayList);
                    break;
                case 2:
                    System.out.println("Введите индекс элемента, который желаете удалить.");
                    arrayList.remove(sc.nextInt());
                    System.out.println(arrayList);
                    break;
                case 3:
                    System.out.println(arrayList);
                    break;
                case 4:
                    System.out.println("Введите число для проверки наличия в списке:");
                    System.out.println(arrayList.contains((Integer) sc.nextInt()));
                    break;
                case 5:
                    System.out.println("Введите индекс элемента который необходимо заменить и новое значение:");
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    if (index > 0 && index < arrayList.size()) {
                        arrayList.set(index, value);
                    } else {
                        System.out.println("Вы вышли за границы массива!");
                    }
                    System.out.println(arrayList);
                    break;
            }
        } while (choice != 6);
    }
}
