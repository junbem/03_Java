package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        List<String> stringlist = new ArrayList<String>(Arrays.asList("hello", "world", "stream"));

        System.out.println("================ for");
        for (String s : stringlist) {
            System.out.println(s);
            System.out.println("================= stream");

        }

    }
}
