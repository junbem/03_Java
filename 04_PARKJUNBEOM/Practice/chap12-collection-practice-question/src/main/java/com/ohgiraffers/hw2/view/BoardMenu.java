package com.ohgiraffers.hw2.view;

import java.util.Scanner;

public class BoardMenu {
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {
        String menu1 = """
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기
                2. 게시글 전체보기
                3. 게시글 한 개 보기
                4. 게시글 제목 수정
                5. 게시글 내용 수정
                6. 게시글 삭제
                7. 게시글 제목 검색
                8. 정렬하기
                9. 끝내기
                메뉴 번호 선택 : """;
        System.out.print(menu1);
        sc.nextInt();

    }
    public void sortSubMenu() {
        String menu2 = """
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬
                2. 글번호순 내림차순 정렬
                3. 작성날짜순 오름차순 정렬
                4. 작성날짜순 내림차순 정렬
                5. 글제목순 오름차순 정렬
                6. 글제목순 내림차순 정렬
                7. 전 메뉴로 돌아가기 
                메뉴 번호 선택 : """;
        System.out.print(menu2);
        sc.
    }
}
