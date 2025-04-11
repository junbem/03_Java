package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {

    public static void main(String[] args) {

        /*
        * [메소드 참조 표현식]
        * 클래스이름:: 메소드이름
        * 참조변수이름:: 메소드이름
        * */

        BiFunction<String, String, Boolean> bf = (st1, st2) -> st1.equals(st2);
        System.out.println(bf.apply("hello", "hello"));

        BiFunction<String, String, Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("hello", "hello"));

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("hello");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        forEach(subjects, System.out::println);
    }

    private static void forEach(List <? extends Object> list, Consumer<Object> consumer) {
        for (Object object : list) {
            consumer.accept(object);
        }
    }
}
