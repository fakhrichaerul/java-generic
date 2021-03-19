package fakhri.application;

import fakhri.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(3000));
        print(new MyData<String>("Fakhri"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
