package com.ohgiraffers.section2.functionalIinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /*
        * Operator : Function과 똑같이 applyXXXx() 메소드를 가지고 있다.
        *           차이점은 매개변수로 연산을 한 후 동일 타입으로 리턴함.
        * */
        BinaryOperator<String> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply("hello", "word"));

        UnaryOperator<String> unaryOperator = (a) -> a = "wor;d!";
        System.out.println(unaryOperator.apply("hello"));
    }
}
