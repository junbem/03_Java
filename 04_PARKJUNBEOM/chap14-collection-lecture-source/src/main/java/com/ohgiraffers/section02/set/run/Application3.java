package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        TreeSet<String> lSet = new TreeSet<String>();
        Set<String> tset = new TreeSet<String>();

        tset.add("java");
        tset.add("mysql");
        tset.add("Jdbc");
        tset.add("Html");
        tset.add("CSS");

        System.out.println(tset.size());
        System.out.println("tset = " + tset);

    }
}
