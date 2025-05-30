package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private Scanner sc = new Scanner(System.in);
    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();

    public void mainMenu() {
        int choice;
        do {
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
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    bm.insertBoard(ib.inputBoard());
                    break;
                case 2:
                    bm.selectAllList();
                    break;
                case 3:
                    bm.selectOneBoard(ib.inputBoardNo());
                    break;
                case 4:
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle());
                    break;
                case 5:
                    bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent());
                    break;
                case 6:
                    bm.deleteBoard(ib.inputBoardNo());
                    break;
                case 7:
                    bm.searchBoard(ib.inputBoardTitle());
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        } while (choice != 9);
    }

    public void sortSubMenu() {
        int choice;
        do {
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
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    bm.sortList(new AscBoardNo());
                    break;
                case 2:
                    bm.sortList(new DescBoardNo());
                    break;
                case 3:
                    bm.sortList(new AscBoardDate());
                    break;
                case 4:
                    bm.sortList(new DescBoardDate());
                    break;
                case 5:
                    bm.sortList(new AscBoardTitle());
                    break;
                case 6:
                    bm.sortList(new DescBoardTitle());
                    break;
                case 7:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        } while (true);
    }
}
