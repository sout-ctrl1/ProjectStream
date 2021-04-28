package com.company;

public class Main {
    public static void main(String[] args) {
        MyFunc<?> myFunc = new MyFunc() {
            @Override
            public int testFunc(int number1, int number2) {
                return number1 + number2;
            }
        };

        System.out.print("9 + 3 = ");
        testFunc(myFunc, 9, 3);

        MyFunc<?> myFunc2 = ((param1, param2) -> param1 * param2);
        System.out.print("9 * 3 = ");
        testFunc(myFunc2, 9, 3);

        MyFunc<Boolean> myFunc3 = MyFunc::DevidedBy;
        System.out.print("9 / 3 = ");
        testFunc(myFunc3, 9, 3);
    }

    public void myFunc3(MyFunc<?> myFunc3) {
        myFunc3.testFunc(5, 3);
    }

    public static <T> void testFunc(MyFunc<T> myFunc, int number1, int number2) {
        System.out.println(myFunc.testFunc(number1, number2));
    }
}

