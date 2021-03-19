package fakhri.application;

import fakhri.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Fakhri");

        // Invariant tidak boleh diturunkan beda tipe ke parent ataupun child
//        doIt(stringMyData); *error
//        MyData<Object> objectMyData = stringMyData; *error

//        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData;
    }

    public static void doIt(MyData<Object> objectMyData) {
        // Do nothing
    }
}
