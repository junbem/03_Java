package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        NumberDrainage nd = new NumberDrainage();
        int count = 0;

        Scanner sc = new Scanner(System.in);
        while (count < 3){

            System.out.println("--------------" + " 에시  " + (count + 1) + "--------------");
            System.out.println("1에서 100사이의 정수를 하나 입력하세요 : ");
            int a = sc.nextInt();
            System.out.println("1에서 100사이의 정수를 하나 입력하세요 : ");
            int b = sc.nextInt();
            try {
                nd.checkDouble(a, b);
            } catch (NumberRangeException e) {
                System.out.println(e.getMessage());
            } count ++;
        }
            System.out.println("Exit Program✋✋");
    }
}
