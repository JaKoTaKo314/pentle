package org.lauchcode;

public class Main {

    public static void main(String[] args) {
        //Mając tablicę int [] values = {32, 21, 0, 1, 23, 12, 42, 55, 13, 5} znajdź
        // jej największą i najmniejszą wartość i wypisz je na ekran konsoli.
        int[] values = {32, 21, 0, 1, 23, 12, 42, 55, 13, 5};
        int max = values[0];
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        System.out.println("Maksymalna wartość wynosi " + max);
        System.out.println("Minimalna wartość wynosi " + min);
    }
}
