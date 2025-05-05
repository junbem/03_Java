package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    private Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard() {
        System.out.println("새 게시글 등록을 시작합니다.");

        System.out.print("글번호를 입력하세요: ");
        int boardNo = Integer.parseInt(sc.nextLine());

        System.out.print("글 제목을 입력하세요: ");
        String boardTitle = sc.nextLine();

        System.out.print("작성자를 입력하세요: ");
        String boardWriter = sc.nextLine();

        String boardContent = inputBoardContent();

        Date boardDate = new Date(); // 현재 날짜
        int readCount = 0; // 초기 조회수

        return new BoardDTO(boardNo, boardTitle, boardWriter, boardDate, boardContent, readCount);
    }

    public int inputBoardNo() {
        System.out.print("글번호를 입력하세요: ");
        return Integer.parseInt(sc.nextLine());
    }

    public String inputBoardTitle() {
        System.out.print("글 제목을 입력하세요: ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
        System.out.println("글 내용을 입력하세요. (입력 종료는 'exit')");
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if ("exit".equalsIgnoreCase(line)) break;
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
