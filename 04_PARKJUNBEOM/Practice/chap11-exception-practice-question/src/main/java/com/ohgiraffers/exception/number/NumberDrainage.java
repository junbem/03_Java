package com.ohgiraffers.exception.number;

import org.w3c.dom.ls.LSOutput;

public class NumberDrainage {

    public boolean checkDouble(int a, int b) throws NumberRangeException{
        if (a > 0 && b > 0 && a <= 100 && b <= 100) {
            if (a % b == 0) {
                System.out.println(a + "는 " + b + "의 배수입니다.");
            } else {
                System.out.println(a + "는 " + b + "의 배수가 아닙니다.");
            }
        } else {
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        }
        return true;
    }
}
