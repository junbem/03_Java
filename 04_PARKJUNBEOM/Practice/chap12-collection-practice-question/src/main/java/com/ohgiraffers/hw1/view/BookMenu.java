package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();
    private BookDTO bd = new BookDTO();

    public void menu() {

        while (true) {
            String menu = """ 
                *** 도서 관리 프로그램 ***
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색 출력
                5. 전체 출력
                6. 끝내기
                """;
            System.out.println(menu);
            System.out.print("메뉴 선택 : ");
            int select = sc.nextInt();

            if (select == 1) {bm.addBook(inputBook());}


            if (select == 2) {
                System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순) : ");
                int select1 = sc.nextInt(); // sc.nextInt(); -> 왜 안되는지 질문하기
                bm.sortedBookList(select1);
                if (select1 == 1) {
                    AscCategory ascCategory = new AscCategory();
                    System.out.println(ascCategory);
                } else if (select1 == 2) {
                    DescCategory descCategory = new DescCategory();
                    System.out.println(descCategory);
                } else {
                    System.out.println("번호를 잘못입력하였습니다.");
                }
                ArrayList<BookDTO> sortedList= bm.sortedBookList(select1);
                bm.printBookList(sortedList);
            }

            if (select == 3) {
                System.out.print("삭제할 도서 번호를 입력하세요 : ");
                int select2 = sc.nextInt();
                if (select2 == bd.getbNO()) {
                    bm.deleteBook(select2);
                }
            }

            if (select == 4) {
                System.out.println("검색할 도서 제목을 입력하세요.");
                String inputtedBookTitle = inputBookTitle();
                bm.searchBook(inputtedBookTitle);
                if (bm.searchBook(inputtedBookTitle) == -1) {
                    System.out.println("조회한 도서가 존재하지 않음.");
                } else {
                    bm.printBook(bm.searchBook(inputtedBookTitle));
                }
            }

            if (select == 5) {
                bm.displayAll();
            }

            if (select == 6) {
                break;
            }
        }

    }
    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int no = sc.nextInt();
        sc.nextLine();  // 개행 처리
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine(); // 개행 처리
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(no, category, title, author); // 매개변수 생성자 사용
    }


    public String inputBookTitle() {
        sc.nextLine();
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
}


