package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 컬렉션 프레임워크(Collection Framework)
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다.
        * */

        /*
        * ArrayList
        * 가장 많이 사용되는 컬렉션 클래스이다.
        * JDK 1.2부터 제공된다.
        * */

        ArrayList alist = new ArrayList();
        ArrayList blist = new ArrayList();


        List list = new ArrayList();

        Collection clist = new ArrayList();

        alist.add("apple"); // alist[0] = "apple";과 비슷한 동작
        alist.add(123); // autoboxing
        alist.add(45.67);
        alist.add(new Date());

        System.out.println("alist = " + alist);

        /*
        * arrayList의 크기는 size()메소드로 확인가능
        * 단, size()메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.
        * */
        System.out.println("alist.size() = " + alist.size());

        for (int i = 0; i < alist.size(); i++) {
            alist.get(i);
            System.out.println(alist.get(i));
        }

        // add, remove(제거), get(가져오기), set(수정)

        List<String> stringList = new ArrayList<>();

        stringList.add("orange");
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");

        Collections.sort(stringList); // String에는 문자열 오름차순에 대한 정의가 되어있다.
        System.out.println("stringList = " + stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(1);
        integerList.add(2);

        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);
        Collections.reverse(integerList);
        System.out.println("integerList = " + integerList);

        stringList = new LinkedList<>(stringList);

        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }

        List<String> descList = new ArrayList<>(); // 받아줄 공간 만들기
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList = " + descList);
    }
}