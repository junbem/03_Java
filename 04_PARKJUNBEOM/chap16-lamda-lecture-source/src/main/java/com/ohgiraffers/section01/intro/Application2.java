package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {
        OuterCalculator.Sum sum = (a, b) -> a + b;
        OuterCalculator.Minus minus = (a, b) -> a - b;
        System.out.println(sum.sumToNumber(1, 2));
        System.out.println(minus.minToNumber(2, 3));
    }
}
