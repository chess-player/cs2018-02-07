package by.it.lapytko.lesson05;

import java.util.ArrayList;


/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/
public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Я");
        list.add("хочу");
        list.add("стать");
        list.add("хорошим");
        list.add("программистом");
        System.out.println(list.size());
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Я");
                    break;
                case 2:
                    System.out.println("хочу");
                    break;
                case 3:
                    System.out.println("стать");
                    break;
                case 4:
                    System.out.println("хорошим");
                    break;
                case 5:
                    System.out.println("программистом");
                    break;
            }

        }


    }


}