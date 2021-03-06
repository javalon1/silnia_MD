package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {

        // 5! = 5 * 4 * 3 * 2 * 1
        int silnia = 5;
        int wynik = 1;
        for (int i = 1; i <= silnia; i++) {
            wynik = wynik * i;
        }

        System.out.println("Silnia: " + wynik);
        System.out.println(silnia(5));
        System.out.println(ciag(4));
        System.out.println(ciag2(5));

    }


    public static int silnia(int n) {
        System.out.println(n);
        if (n < 2) {
            return 1;
        }
        //Wywolanie rekurencyjne
        return n * silnia(n - 1);

    }

    public static double ciag(int n) {
        double a = n;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 0.5;
        }
        // Rekurencja
        return -ciag(n - 1) * ciag(n - 2);
    }


    public static int ciag2(int n) {
        if (n == 1) {
            return -n;
        }
        return -ciag2(n - 1) * n - 3;
    }
}


