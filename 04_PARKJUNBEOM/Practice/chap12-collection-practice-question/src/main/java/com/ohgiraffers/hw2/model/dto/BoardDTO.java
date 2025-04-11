package com.ohgiraffers.hw2.model.dto;

import java.util.Date;

public class BoardDTO {
    private int boardNO;
    private String boardTitle;
    private Date boardDate;
    private String boardContent;
    private int readCount;

    public BoardDTO() {
    }

    public BoardDTO(int boardNO, String boardTitle, Date boardDate, String boardContent, int readCount) {
        this.boardNO = boardNO;
        this.boardTitle = boardTitle;
        this.boardDate = boardDate;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    public int getBoardNO() {
        return boardNO;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public Date getBoardDate() {
        return boardDate;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setBoardNO(int boardNO) {
        this.boardNO = boardNO;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardNO=" + boardNO +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardDate=" + boardDate +
                ", boardContent='" + boardContent + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}
