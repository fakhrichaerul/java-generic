package fakhri.application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(3000);
        NumberData<Double> doubleNumberData = new NumberData<>(300.00);
//        NumberData<String> stringNumberData = new NumberData<String>("asdf"); //ERROR

    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

            this.data = data;
        }
    }
}
