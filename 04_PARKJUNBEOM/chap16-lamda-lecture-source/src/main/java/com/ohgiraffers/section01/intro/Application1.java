package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 람다식에서 매개변수의 타입은 추론이 가능하기 때문에 명시적으로 작성하지 않아도 된다.
        * 또한 매개변수가 한 개만 존재하는 경우 ()를 생략할 수도 있으며, 실행문이 한 줄인 경우
        * {}를 생략이 가능하다.
        * */
        /*
        * 인터페이스에 정의된 추상메소드를 활용
        * 1. 인터페이스르 상속받은 클래스를 정의하여 기능을 완성 후 사용하는 방법
        * */
        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합은 : " + (c1.sumToNumber(10, 20)));
        /* 2. 익명 클래스를 활용하여 메소드 재정의 후 사용하는 방법*/
        Calculator c2 = new Calculator() {

            @Override
            public int sumToNumber(int a, int b) {
                return a + b;
            }
        };

        System.out.println((c2.sumToNumber(10, 20)));

        /* 람다식을 활용하는 방법*/
        Calculator c3 = (int a, int b) -> a + b;
        System.out.println((c3.sumToNumber(10, 20)));
    }
}
