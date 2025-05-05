package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {
    BoardManager bm = new BoardManager();
    InputBoard ib = new InputBoard();

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        String menu = """
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기
                2. 게시글 전체보기
                3. 게시글 한 개보기
                4. 게시글 제목 수정
                5. 게시글 내용 수정
                6. 게시글 삭제
                7. 게시글 제목 검색
                8, 정렬하기
                9. 끝내기
                메뉴 번호 선택 : """;
        while (true) {
            System.out.print(menu);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: bm.insertBoard(ib.inputBoard()); break;
                case 2: bm.selectAllList(); break;
                case 3: bm.selectOneBoard(ib.inputBoardNo());break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }

    }

    public void sortSubMenu() {
        String submenu = """
                 ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬
                2. 글번호순 내림차순 정렬
                3. 작성날짜순 오름차순 정렬
                4. 작성날짜순 내림차순 정렬
                5. 글제목순 오름차순 정렬
                6. 글제목순 내림차순 정렬
                7. mainMenu()메소드로 이동
                메뉴 번호 선택 : """;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(submenu);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
    }
}
