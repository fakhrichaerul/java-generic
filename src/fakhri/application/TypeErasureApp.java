package fakhri.application;

import fakhri.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Fakhri");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        integerMyData.setData(3000);

        Integer integer = integerMyData.getData();

    }
}
;