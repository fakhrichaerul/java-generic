package fakhri.application;

import fakhri.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Fakhri");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData; // Cara pertama
    }

    public static void process(MyData<? extends Object> myData) { // Cara kedua
        System.out.println(myData.getData());

//        myData.setData(); *tidak bisa dan tidak boleh karna berbahaya

    }
}
