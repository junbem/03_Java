package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {
        /*
        * LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있다.
        * (중복제거 + 순서유지)
        * */
        Set<String> lSet = new HashSet<>();

        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("frideEgg");
        lSet.add("chicken");

        System.out.println("lSet = " + lSet);

        Iterator<String> iterator = lSet.iterator();

    }
}
