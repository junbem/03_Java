package com.ohgiraffers.stream;

import java.util.List;

public class PrintName {

    public static void main(String[] args) {

        // 문제: 이름 리스트에서 길이가 5글자 이상인 이름만 골라 대문자로 바꾸고 출력하세요.
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve","Franklin");
            // 출력값
            // ALICE
            // CHARLIE
            // DAVID
            // FRANKLIN

        names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
