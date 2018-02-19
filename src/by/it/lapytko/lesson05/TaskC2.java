package by.it.lapytko.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Arrays.sort;

public class TaskC2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
        }
    }
}
        /*public static void sort( int[] array)*/