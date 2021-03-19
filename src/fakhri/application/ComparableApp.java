package fakhri.application;

import fakhri.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Fakhri", "Bandung"),
                new Person("Budi", "Jakarta"),
                new Person("Susi", "Surabaya ")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
