package com.kodilla.stash.lesson1;

public class CodeWars {

    public static double returnNumber(double number) {
        System.out.println("inside returnNumber method :D");
        return number;
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(1));
        System.out.println(returnNumber(21.456));

        int[] tablica = {5, 14, 31, 26, 12};

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("index " + i + " tablicy ma wartosc: " + tablica[i]);
        }
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = "name" + 1;
        }
        double[] doubles = {12.4, 21.4, 32.7, 41.2};
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        char[] chars = new char[10];
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[i] += 1;
            System.out.println(i);
        }

        int[][] duoMatrix = new int[8][11];
        for (int i = 0; i < duoMatrix.length; i++) {
            for (int j = 0; j < duoMatrix[i].length; j++) {
                char znak = (char) (duoMatrix.length * i + 'A' + j);
                duoMatrix[i][j] = znak;
                System.out.print(znak + " ");
            }
            System.out.println();
        }

        String[] namesArray = new String[7];
        for (int i = 0; i < namesArray.length; i++) {
            namesArray[i] = "name" + (i + 1);
        }
        for (String element : namesArray) {
            System.out.println(element);
        }
    }
}
