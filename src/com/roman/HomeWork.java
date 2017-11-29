package com.roman;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        double sum = 0;
        System.out.println("Введите 5 чисел: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        System.out.println("Среднее арифметическое: " + sum / a.length);
    }
}