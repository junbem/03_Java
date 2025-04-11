package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum{
        int sumToNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minToNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multipleToNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Devide {
        int devideToNumber(int a, int b);
    }
}
