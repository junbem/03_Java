package com.ohgiraffers.section2.functionalIinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {

    public static void main(String[] args) {

        // Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());

        BiFunction<String, String, Integer> biFunction = (str1, str2)
                -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String st1 = "12345";
        String st2 = "56789";
        System.out.println(biFunction.apply(st1, st2) + " : " + biFunction.apply(st1, st2).getClass().getName());
    }
}
