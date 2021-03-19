package fakhri.application;

import fakhri.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Fakhri");
        MyData<Integer> integerMyData = new MyData<Integer>(1000);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
