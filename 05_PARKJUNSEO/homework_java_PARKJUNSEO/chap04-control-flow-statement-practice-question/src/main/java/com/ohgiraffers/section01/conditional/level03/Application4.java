package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        *  합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        *  (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        *  합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        *  불합격인 경우에는 “불합격입니다.”를 출력하세요.
        *
        *  -- 출력 예시
        *	ex 1.			ex 2.
        *	국어점수 : 88		국어점수 : 88
        *	수학점수 : 50		수학점수 : 50
        *	영어점수 : 40		영어점수 : 45
        *	불합격입니다.		    국어 : 88
        *					    수학 : 50
        *					    영어 : 45
        *					    합계 : 183
        *					    평균 : 61.0
        *				 	    축하합니다, 합격입니다!
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int Kr = sc.nextInt();
        System.out.print("영어 점수 : ");
        int En = sc.nextInt();
        System.out.print("수학 점수 : ");
        int Ma = sc.nextInt();
        int Sum = Kr + En + Ma;
        double Avg = (double) Sum / 3;

        if (Kr >= 40 & En >= 40 & Ma >= 40 & Sum >= 180) {
            System.out.println("국어 : " + Kr);
            System.out.println("영어 : " + En);
            System.out.println("수학 : " + Ma);
            System.out.println("합계 : " + Sum);
            System.out.println("평균 : " + Avg);
            System.out.println("축하합니다, 합격입니다!");
        } else {
            System.out.println("불합격입니다.");
        }



    }
}

