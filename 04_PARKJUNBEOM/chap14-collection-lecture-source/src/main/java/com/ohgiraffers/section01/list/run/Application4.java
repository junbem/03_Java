package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Stack 이란
        * 후입선출(LIFO)의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리한다.
        * */

        Stack<Integer> stack = new Stack<>();

        // add와 저장 내부 공간이 다르다
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("peek() : " + stack.peek()); // 맨 마지막 요소
        System.out.println("stack = " + stack);

        System.out.println("search() : " + stack.search(2));    // 값에 대한 위치
        System.out.println("pop() = " + stack.pop()); // 더이상 없는 값일때 pop을 하면 EmptyStackException 발생


    }
}
