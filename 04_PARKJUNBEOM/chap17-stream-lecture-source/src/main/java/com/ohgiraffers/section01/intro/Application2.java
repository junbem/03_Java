package com.ohgiraffers.section01.intro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));

        System.out.println("================ foreach");
        for (String s : stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }
        System.out.println("================ noarmal stream");
        stringList.forEach(Application2::print);
        System.out.println("================ paralle stream");
        stringList.parallelStream().forEach(Application2::print);

        System.out.println("===============================");
    }
    private static void print (String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
