package com.company;

@FunctionalInterface
public interface MyFunc<T> {
    public int testFunc(int param1, int param2);

    static int DevidedBy(int number1, int number2) {
        return number1 / number2;
    }
}
