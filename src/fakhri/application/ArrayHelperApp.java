package fakhri.application;

import fakhri.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Fakhri", "Chaerul", "Insan"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Simbol berlian di pemanggilan method tidak wajib
        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
