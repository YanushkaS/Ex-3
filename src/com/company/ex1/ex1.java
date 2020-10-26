package com.company.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        System.out.println("Wprowaz 3 liczby całkowite ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int liczbaA = scanner.nextInt();
        System.out.println("Podaj liczbe b: ");
        int liczbaB = scanner.nextInt();
        System.out.println("Podaj liczbe c: ");
        int liczbaC = scanner.nextInt();

        int delta = liczbaB * liczbaB - 4 * liczbaA * liczbaC;
        System.out.println("Delta wynosu: " + delta);

        double x1 = -liczbaB - Math.sqrt(delta) / 2 * liczbaA;
        System.out.println("Pierwiastek x1 wynosi: " + x1);

        double x2 = -liczbaB + Math.sqrt(delta) / 2 * liczbaA;
        System.out.println("Pierwiastek x2 wynosi: " + x2);
    }
}