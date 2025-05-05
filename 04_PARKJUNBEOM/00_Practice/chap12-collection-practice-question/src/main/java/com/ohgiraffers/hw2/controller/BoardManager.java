package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList = new ArrayList<>();
    private ResultPrinter rp = new ResultPrinter();

    public void insertBoard(BoardDTO b) {
        if (b == null) {
            rp.errorPage("insertBoard");
            return;
        }

        // 글번호 자동 지정
        if (!boardList.isEmpty()) {
            int lastNo = boardList.get(boardList.size() - 1).getBoardNo();
            b.setBoardNo(lastNo + 1);
        } else {
            b.setBoardNo(1);
        }

        boardList.add(b);
        rp.successPage("insertBoard");
    }

    public void selectAllList() {
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo) {
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setReadCount(board.getReadCount() + 1);
                rp.printBoard(board);
                return;
            }
        }
        rp.errorPage("selectOne");
    }

    public void updateBoardTitle(int boardNo, String title) {
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setBoardTitle(title);
                rp.successPage("updateTitle");
                return;
            }
        }
        rp.errorPage("updateTitle");
    }

    public void updateBoardContent(int boardNo, String content) {
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setBoardContent(content);
                rp.successPage("updateContent");
                return;
            }
        }
        rp.errorPage("updateContent");
    }

    public void deleteBoard(int boardNo) {
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                boardList.remove(i);
                rp.successPage("deleteBoard");
                return;
            }
        }
        rp.errorPage("deleteBoard");
    }

    public void searchBoard(String title) {
        ArrayList<BoardDTO> resultList = new ArrayList<>();
        for (BoardDTO board : boardList) {
            if (board.getBoardTitle().contains(title)) {
                resultList.add(board);
            }
        }

        if (resultList.isEmpty()) {
            rp.noSearchResult();
        } else {
            rp.printAllList(resultList);
        }
    }

    public void sortList(Comparator<BoardDTO> c) {
        boardList.sort(c);
        rp.printAllList(boardList);
    }
}
