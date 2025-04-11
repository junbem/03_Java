package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgiraffers.section01.list.dto.PersonDTO;

import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public class Application1 {

    public static void main(String[] args) {

       HashMap hmap = new HashMap();

       hmap.put("one", new Date());
       hmap.put(12,"red apple");
       hmap.put(33,123);

        System.out.println(hmap);
        hmap.put(12,"yellow banana");
        System.out.println(hmap);
        // (값을 바꾸는 행위를 하면) 동일한 키 값으로 다른값을 대입하면 이전에 있었던 값을 수정한다.
        hmap.put(11,"yellow banana"); // 키 값은 중복 안됨.
        System.out.println(hmap);

        System.out.println(hmap.get(33));
        System.out.println("========================");
        Map<Object,Object> hMap = new HashMap<>();

        hMap.put("one", new Date());
        hMap.put(12,"red apple");
        hMap.put(33,123);

        System.out.println(hMap.get("one"));
        System.out.println("hMap의 toString() : " + hMap.toString().toString());

        hMap.put(new BookDTO(1,"홍길동전","허균",50000), "허균의 홍길동전이면 오케이");
        //키값을 인스턴스 주소로
        System.out.println("map의 키 값으로 활용되는 객체를 활용 : ");
        hMap.get(new BookDTO(1,"홍길동전","허균",50000));

        System.out.println("Map이 가지고 있는 entry의 수 : " + hMap.size());
        //System.out.println("\"one\"이라는 키 값을 가진 entry 삭제 : " + hMap,remove("one"));
        System.out.println(hMap);

        Map<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java 17");
        hMap2.put("two", "mysql");
        hMap2.put("three", "servlet/jsp");
        hMap2.put("four", "springboot 3.0");
        hMap2.put("five", "react.jsl");

        // 1. KsySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만듦.
        Iterator<String> keyItER = hMap2.keySet().iterator();
        while (keyItER.hasNext()) {
            String key = keyItER.next();
            String value = hMap2.get(key);
        }

        // 2. 저장된 value 객체들만 values()로 Collection으로 만듦.
        Collection<String> values = hMap2.values();

        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Object[] array = values.toArray();
        for(int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        // Map의 내부클래스인 EntrySet을 이용
        Set<Map.Entry<String, String>> entries = hMap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIterator = entries.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String,Object> hMap3 = new HashMap<>();

        hMap3.put("book", new BookDTO());
        hMap3.put("person", new PersonDTO());

        System.out.println(hMap3.get("book"));

        ArrayList<BookDTO> bList = new ArrayList<>();
        hMap3.put("bList",bList);
        ArrayList<PersonDTO> pList = new ArrayList<>();
        hMap3.put("pList",pList);




    }
}
