package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("게시물이 없습니다.");
        } else {
            System.out.println("전체 게시글 목록:");
            for (BoardDTO board : list) {
                System.out.println(board);
            }
        }
    }

    public void printBoard(BoardDTO b) {
        if (b == null) {
            System.out.println("해당 게시글이 존재하지 않습니다.");
        } else {
            System.out.println("게시글 상세 정보:");
            System.out.println(b);
        }
    }

    public void errorPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시물 등록 실패");
                break;
            case "selectOne":
                System.out.println("조회된 글이 없습니다.");
                break;
            case "updateTitle":
                System.out.println("게시물 제목 수정 실패!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 실패!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 실패!");
                break;
            default:
                System.out.println("알 수 없는 오류가 발생했습니다.");
        }
    }

    public void successPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시글 등록 성공!");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 성공!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 성공!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 성공!");
                break;
            default:
                System.out.println("작업이 성공적으로 완료되었습니다.");
        }
    }

    public void noSearchResult() {
        System.out.println("검색 결과가 없습니다.");
    }
}
