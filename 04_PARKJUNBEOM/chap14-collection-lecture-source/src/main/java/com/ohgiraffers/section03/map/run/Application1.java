package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgiraffers.section01.list.dto.PersonDTO;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        hmap.put(12, "yellow banana");

        System.out.println(hmap); // 동일한 키값으로 다른값을 대입하면 이전에 있던 값을 수정한다 (덮어쓰기)
        hmap.put(11, "yellow banana");
        System.out.println(hmap);

        System.out.println(hmap.get(33));
        System.out.println("======================================");
        Map<Object, Object> hMap = new HashMap<>();

        hMap.put("one", new Date()); // 13번째 줄과 같은 결과를 가져온다.

        hMap.put(new BookDTO(1, "홍길동전", "허균", 50000), "허균의 홍길동전이면 오케이");
        System.out.println("map의 키 값으로 활용되는 객체를 활용: " + hMap.get(new BookDTO(1, "홍길동전", "허균", 50000)));

        System.out.println("map이 가지고 있는 entry의 수 : " + hMap.size());
        System.out.println("\"one\" 이라는 키값을 가진 entry 삭제 : " + hMap.remove("one"));
        System.out.println(hmap);

        Map<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java 17");

        // 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만듦
        Iterator<String> keyIter = hMap2.keySet().iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hMap2.get(key);

            System.out.println(key + " = " + value);
        }

        //2. 저장된 value객체들만 values()로 Collection으로 만듦
        Collection<String> values = hMap2.values();

        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Object[] array = hMap.values().toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        Map의 내부클래스인 EntrySet을 이용 : entrySet();
        Set<Map.Entry<String, String>> entries = hMap2.entrySet();

//        Interator<Map.Entry<String, String>> entryiter = entries.

        Map<String, Object> hMap3 = new HashMap<>();
        hMap3.put("book", new BookDTO());
        hMap3.put("person", new PersonDTO());

        System.out.println(hMap3.get("book"));

        ArrayList<BookDTO> bList = new ArrayList<>();
        hMap3.put("bList", bList);
        ArrayList<PersonDTO> pList = new ArrayList<>();
        hMap3.put("pList", pList);
    }
}
