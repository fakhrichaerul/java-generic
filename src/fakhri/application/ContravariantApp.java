package fakhri.application;

import fakhri.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Fakhri");

//        objectMyData.setData(1000); *Error dan tidak aman

        MyData<?super String> myData = objectMyData;

        process(objectMyData);

        System.out.println("Eksekusi main --- ");
        System.out.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData) {

        String value = (String) myData.getData();
        System.out.println("Process parameter = " + value);

        // Contravariant aman untuk di "set" tapi tidak aman untuk di "get"
        myData.setData("Fakhri Chaerul");

    }
}
